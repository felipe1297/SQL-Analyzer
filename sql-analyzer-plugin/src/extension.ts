import * as vscode from 'vscode';
import { exec } from 'child_process';
import * as path from 'path';
import * as crypto from 'crypto';

const errorDecorationType = vscode.window.createTextEditorDecorationType({
    backgroundColor: 'rgba(255,0,0,0.3)',
    isWholeLine: true
});

const codeSmellDecorationType = vscode.window.createTextEditorDecorationType({
    backgroundColor: 'rgba(255,255,0,0.3)',
    isWholeLine: true
});

const secretKey = crypto.randomBytes(32);
const iv = crypto.randomBytes(16);

function resetDecorations(editor: vscode.TextEditor) {
    editor.setDecorations(errorDecorationType, []);
    editor.setDecorations(codeSmellDecorationType, []);
}

function encrypt(text: string): string {
    const cipher = crypto.createCipheriv('aes-256-ctr', secretKey, iv);
    let encrypted = cipher.update(text, 'utf8', 'hex');
    encrypted += cipher.final('hex');
    return encrypted;
}

function decrypt(text: string): string {
    const decipher = crypto.createDecipheriv('aes-256-ctr', secretKey, iv);
    let decrypted = decipher.update(text, 'hex', 'utf8');
    decrypted += decipher.final('utf8');
    return decrypted;
}

async function getDBCredentials(update: boolean = false): Promise<{ host: string, port: string, user: string, password: string, database: string }> {
    const config = vscode.workspace.getConfiguration('sqlAnalyzer');
    let host = update ? '' : config.get<string>('dbHost') || '';
    let port = update ? '' : config.get<string>('dbPort') || '';
    let user = update ? '' : config.get<string>('dbUser') || '';
    let encryptedPassword = update ? '' : config.get<string>('dbPassword') || '';
    let database = update ? '' : config.get<string>('dbDatabase') || '';
    let password = '';

    if (encryptedPassword) {
        password = decrypt(encryptedPassword);
    }

    host = await vscode.window.showInputBox({ prompt: '🌐 Enter Database Host', value: host }) || host;
    port = await vscode.window.showInputBox({ prompt: '🌐 Enter Database Port', value: port }) || port;
    user = await vscode.window.showInputBox({ prompt: '👤 Enter Database User', value: user }) || user;
    password = await vscode.window.showInputBox({ prompt: '🔒 Enter Database Password', value: password, password: true }) || password;
    encryptedPassword = encrypt(password);
    database = await vscode.window.showInputBox({ prompt: '📂 Enter Database Name', value: database }) || database;

    await config.update('dbHost', host, vscode.ConfigurationTarget.Global);
    await config.update('dbPort', port, vscode.ConfigurationTarget.Global);
    await config.update('dbUser', user, vscode.ConfigurationTarget.Global);
    await config.update('dbPassword', encryptedPassword, vscode.ConfigurationTarget.Global);
    await config.update('dbDatabase', database, vscode.ConfigurationTarget.Global);

    return { host, port, user, password, database };
}

function validateDBCredentials(credentials: { host: string, port: string, user: string, password: string, database: string }): Promise<boolean> {
    return new Promise((resolve) => {
        const { host, port, user, password, database } = credentials;
        const connectionString = `postgresql://${user}:${password}@${host}:${port}/${database}`;

        const testConnectionScriptPath = path.join(__dirname, '..', 'scripts', 'test_connection.py');
        exec(`python3 ${testConnectionScriptPath} "${connectionString}"`, (err) => {
            if (err) {
                resolve(false);
            } else {
                resolve(true);
            }
        });
    });
}

async function analyzeSQL(query: string, document: vscode.TextDocument, showDiagram: boolean, credentials?: { host: string, port: string, user: string, password: string, database: string }) {
    const scriptPath = path.join(__dirname, '..', 'scripts', 'analyze.py');
    let command = `python3 ${scriptPath} "${query}"`;

    if (credentials) {
        command += ` "${credentials.host}" "${credentials.port}" "${credentials.user}" "${credentials.password}" "${credentials.database}"`;
    }

    exec(command, (err, stdout, stderr) => {
        if (err) {
            vscode.window.showErrorMessage(`❌ Error: ${stderr}`);
            return;
        }

        let analysisResults;
        try {
            analysisResults = JSON.parse(stdout);
            console.log("Analysis Results:", analysisResults);
        } catch (parseError) {
            vscode.window.showErrorMessage(`❌ Failed to parse analysis results: ${(parseError as Error).message}`);
            return;
        }

        const editor = vscode.window.activeTextEditor;
        if (editor) {
            console.log("Applying decorations...");

            resetDecorations(editor);

            const totalLines = document.lineCount;
            const lineOffset = -1;

            if (analysisResults.lexicalErrors.length > 0) {
                const lexicalErrorDecorations: vscode.DecorationOptions[] = [];
                analysisResults.lexicalErrors.forEach((error: { line: number; message: string; }) => {
                    console.log("Antes de crear el rango de decoración para errores léxicos");

                    const adjustedLine = error.line + lineOffset;

                    if (adjustedLine >= 0 && adjustedLine < totalLines) {
                        try {
                            const range = new vscode.Range(
                                new vscode.Position(adjustedLine, 0),
                                new vscode.Position(adjustedLine, document.lineAt(adjustedLine).range.end.character)
                            );
                            console.log("Después de crear el rango de decoración para errores léxicos", range);
                            
                            lexicalErrorDecorations.push({
                                range: range,
                                hoverMessage: error.message
                            });
                        } catch (err) {
                            console.error("Error al crear el rango de decoración para errores léxicos:", err);
                        }
                    } else {
                        console.warn(`Línea de error léxico fuera de rango: ${adjustedLine}`);
                    }

                    console.log("Después de la lógica de decoración para errores léxicos");
                });
                editor.setDecorations(errorDecorationType, lexicalErrorDecorations);

                vscode.window.showErrorMessage(`❌ SQL analysis found lexical errors. Please correct them and try again.`);
                return;
            }

            if (analysisResults.syntaxErrors.length > 0) {
                const syntaxErrorDecorations: vscode.DecorationOptions[] = [];
                analysisResults.syntaxErrors.forEach((error: { line: number; message: string; }) => {
                    console.log("Antes de crear el rango de decoración para errores sintácticos");

                    const adjustedLine = error.line + lineOffset;

                    if (adjustedLine >= 0 && adjustedLine < totalLines) {
                        try {
                            const range = new vscode.Range(
                                new vscode.Position(adjustedLine, 0),
                                new vscode.Position(adjustedLine, document.lineAt(adjustedLine).range.end.character)
                            );
                            console.log("Después de crear el rango de decoración para errores sintácticos", range);
                            
                            syntaxErrorDecorations.push({
                                range: range,
                                hoverMessage: error.message
                            });
                        } catch (err) {
                            console.error("Error al crear el rango de decoración para errores sintácticos:", err);
                        }
                    } else {
                        console.warn(`Línea de error sintáctico fuera de rango: ${adjustedLine}`);
                    }

                    console.log("Después de la lógica de decoración para errores sintácticos");
                });
                editor.setDecorations(errorDecorationType, syntaxErrorDecorations);

                vscode.window.showErrorMessage(`❌ SQL analysis found syntax errors. Please correct them and try again.`);
                return;
            }

            const codeSmellDecorations: vscode.DecorationOptions[] = [];
            analysisResults.codeSmells.forEach((smell: { line: number; message: string; }) => {
                console.log("Antes de crear el rango de decoración para code smells");

                const adjustedLine = smell.line + lineOffset;

                if (adjustedLine >= 0 && adjustedLine < totalLines) {
                    try {
                        const range = new vscode.Range(
                            new vscode.Position(adjustedLine, 0),
                            new vscode.Position(adjustedLine, document.lineAt(adjustedLine).range.end.character)
                        );
                        console.log("Después de crear el rango de decoración para code smells", range);
                        
                        codeSmellDecorations.push({
                            range: range,
                            hoverMessage: smell.message
                        });
                    } catch (err) {
                        console.error("Error al crear el rango de decoración para code smells:", err);
                    }
                } else {
                    console.warn(`Línea de code smell fuera de rango: ${adjustedLine}`);
                }

                console.log("Después de la lógica de decoración para code smells");
            });
            editor.setDecorations(codeSmellDecorationType, codeSmellDecorations);

            vscode.window.showInformationMessage(`✅ Analysis completed.`);

            if (showDiagram) {
                createWebviewPanel(analysisResults.diagram, analysisResults.codeSmells);
            }
        } else {
            console.log("No active editor found.");
        }
    });
}

function createWebviewPanel(diagramContent: string, codeSmells: { line: number, message: string }[]) {
    const panel = vscode.window.createWebviewPanel(
        'sqlAnalyzer',
        'SQL Analyzer Diagram',
        vscode.ViewColumn.Beside,
        {
            enableScripts: true,
        }
    );

    const codeSmellsHTML = codeSmells.map(smell => `<p>Line ${smell.line + 1}: ${smell.message}</p>`).join("");

    panel.webview.html = getWebviewContent(diagramContent, codeSmellsHTML);

    setTimeout(() => {
        const editor = vscode.window.activeTextEditor;
        if (editor) {
            vscode.window.showTextDocument(editor.document, editor.viewColumn, false);
        }
    }, 500);
}

function getWebviewContent(diagramContent: string, codeSmellsHTML: string): string {
    return `
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>SQL Analyzer Diagram</title>
            <style>
                body { font-family: Arial, sans-serif; padding: 20px; }
                h1 { font-size: 1.5em; }
                .diagram { margin-top: 20px; }
                .code-smells { margin-top: 20px; }
                .code-smells p { margin: 5px 0; }
            </style>
        </head>
        <body>
            <h1>SQL Analyzer Diagram</h1>
            <div class="diagram">${diagramContent}</div>
            <h1>Code Smells</h1>
            <div class="code-smells">${codeSmellsHTML}</div>
        </body>
        </html>`;
}

export function activate(context: vscode.ExtensionContext) {
    
    const config = vscode.workspace.getConfiguration('sqlAnalyzer');
    const realTimeAnalysis = config.get<boolean>('realTimeAnalysis', false);

    let disposable = vscode.commands.registerCommand('extension.analyzeSQL', () => {
        const editor = vscode.window.activeTextEditor;
        if (editor) {
            const document = editor.document;
            const query = document.getText();

            if (document.languageId === 'sql') {
                const credentials = config.get<string>('dbHost') ? {
                    host: config.get<string>('dbHost') || '',
                    port: config.get<string>('dbPort') || '',
                    user: config.get<string>('dbUser') || '',
                    password: decrypt(config.get<string>('dbPassword') || ''),
                    database: config.get<string>('dbDatabase') || ''
                } : undefined;

                if (credentials) {
                    validateDBCredentials(credentials).then((valid) => {
                        if (!valid) {
                            vscode.window.showInformationMessage('ℹ️ For a more complete analysis, please provide valid database credentials using the "Update Database Credentials" command in the command palette.');
                        }
                        analyzeSQL(query, document, true, credentials); // true to show diagrams
                    });
                } else {
                    analyzeSQL(query, document, true, credentials); // true to show diagrams
                    vscode.window.showInformationMessage('ℹ️ For a more complete analysis, please provide database credentials using the "Update Database Credentials" command in the command palette.');
                }
            } else {
                vscode.window.showErrorMessage('❌ The active document is not a SQL file.');
            }
        } else {
            vscode.window.showErrorMessage('❌ No active editor found.');
        }
    });

    context.subscriptions.push(disposable);

    if (realTimeAnalysis) {
        let onSaveDisposable = vscode.workspace.onDidSaveTextDocument((document) => {
            if (document.languageId === 'sql') {
                const query = document.getText();
                const credentials = config.get<string>('dbHost') ? {
                    host: config.get<string>('dbHost') || '',
                    port: config.get<string>('dbPort') || '',
                    user: config.get<string>('dbUser') || '',
                    password: decrypt(config.get<string>('dbPassword') || ''),
                    database: config.get<string>('dbDatabase') || ''
                } : undefined;

                analyzeSQL(query, document, false, credentials);
            }
        });

        context.subscriptions.push(onSaveDisposable);
    }

    let updateCredentialsDisposable = vscode.commands.registerCommand('extension.updateDBCredentials', async () => {
        const credentials = await getDBCredentials(true);
        const valid = await validateDBCredentials(credentials);

        if (valid) {
            vscode.window.showInformationMessage('🔑 Database credentials updated and validated successfully.');
        } else {
            vscode.window.showErrorMessage('❌ Invalid database credentials. Please try again.');
        }
    });

    context.subscriptions.push(updateCredentialsDisposable);

    let showCredentialsDisposable = vscode.commands.registerCommand('extension.showDBCredentials', () => {
        const config = vscode.workspace.getConfiguration('sqlAnalyzer');
        const host = config.get<string>('dbHost') || '';
        const port = config.get<string>('dbPort') || '';
        const user = config.get<string>('dbUser') || '';
        const database = config.get<string>('dbDatabase') || '';

        vscode.window.showInformationMessage(`🌐 Host: ${host}, Port: ${port}, User: ${user}, Database: ${database}`);
    });

    context.subscriptions.push(showCredentialsDisposable);
}

export function deactivate() {}
