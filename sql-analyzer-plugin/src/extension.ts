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

const secretKey = 'your-secret-key'; // Use a secure way to manage this key

function resetDecorations(editor: vscode.TextEditor) {
    editor.setDecorations(errorDecorationType, []);
    editor.setDecorations(codeSmellDecorationType, []);
}

function encrypt(text: string): string {
    const cipher = crypto.createCipher('aes-256-ctr', secretKey);
    let encrypted = cipher.update(text, 'utf8', 'hex');
    encrypted += cipher.final('hex');
    return encrypted;
}

function decrypt(text: string): string {
    const decipher = crypto.createDecipher('aes-256-ctr', secretKey);
    let decrypted = decipher.update(text, 'hex', 'utf8');
    decrypted += decipher.final('utf8');
    return decrypted;
}

async function getDBCredentials(): Promise<{ host: string, port: string, user: string, password: string, database: string }> {
    const config = vscode.workspace.getConfiguration('sqlAnalyzer');
    let host = config.get('dbHost', '');
    let port = config.get('dbPort', '');
    let user = config.get('dbUser', '');
    let encryptedPassword = config.get('dbPassword', '');
    let database = config.get('dbDatabase', '');
    let password = '';

    if (encryptedPassword) {
        password = decrypt(encryptedPassword);
    }

    if (!host) {
        host = await vscode.window.showInputBox({ prompt: '🌐 Enter Database Host' }) || '';
        await config.update('dbHost', host, vscode.ConfigurationTarget.Global);
    }
    if (!port) {
        port = await vscode.window.showInputBox({ prompt: '🌐 Enter Database Port', value: '5432' }) || '5432';
        await config.update('dbPort', port, vscode.ConfigurationTarget.Global);
    }
    if (!user) {
        user = await vscode.window.showInputBox({ prompt: '👤 Enter Database User' }) || '';
        await config.update('dbUser', user, vscode.ConfigurationTarget.Global);
    }
    if (!password) {
        password = await vscode.window.showInputBox({ prompt: '🔒 Enter Database Password', password: true }) || '';
        encryptedPassword = encrypt(password);
        await config.update('dbPassword', encryptedPassword, vscode.ConfigurationTarget.Global);
    }
    if (!database) {
        database = await vscode.window.showInputBox({ prompt: '📂 Enter Database Name' }) || '';
        await config.update('dbDatabase', database, vscode.ConfigurationTarget.Global);
    }

    return { host, port, user, password, database };
}

async function promptForCredentialsIfNeeded(forcePrompt: boolean): Promise<{ host: string, port: string, user: string, password: string, database: string }> {
    const config = vscode.workspace.getConfiguration('sqlAnalyzer');
    let executions = config.get('executionsCount', 0);

    if (forcePrompt || executions % 5 === 0) {
        const credentials = await getDBCredentials();
        await config.update('executionsCount', executions + 1, vscode.ConfigurationTarget.Global);
        return credentials;
    } else {
        let host = config.get('dbHost', '');
        let port = config.get('dbPort', '');
        let user = config.get('dbUser', '');
        let encryptedPassword = config.get('dbPassword', '');
        let database = config.get('dbDatabase', '');
        let password = '';

        if (encryptedPassword) {
            password = decrypt(encryptedPassword);
        }

        await config.update('executionsCount', executions + 1, vscode.ConfigurationTarget.Global);

        return { host, port, user, password, database };
    }
}

function analyzeSQL(query: string, document: vscode.TextDocument, showDiagram: boolean, credentials: { host: string, port: string, user: string, password: string, database: string }) {
    const scriptPath = path.join(__dirname, '..', 'scripts', 'analyze.py');

    exec(`python3 ${scriptPath} "${query}" "${credentials.host}" "${credentials.port}" "${credentials.user}" "${credentials.password}" "${credentials.database}"`, (err, stdout, stderr) => {
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

            // Reset decorations before applying new ones
            resetDecorations(editor);

            // Show lexical errors if any
            if (analysisResults.lexicalErrors.length > 0) {
                const lexicalErrorDecorations = analysisResults.lexicalErrors.map((error: { line: number; message: string; }) => ({
                    range: new vscode.Range(new vscode.Position(error.line, 0), new vscode.Position(error.line, document.lineAt(error.line).range.end.character)),
                    hoverMessage: error.message
                }));
                console.log("Lexical Error Decorations:", lexicalErrorDecorations);
                editor.setDecorations(errorDecorationType, lexicalErrorDecorations);

                vscode.window.showErrorMessage(`❌ SQL analysis found lexical errors. Please correct them and try again.`);
                return;
            }

            // Show syntax errors if any
            if (analysisResults.syntaxErrors.length > 0) {
                const syntaxErrorDecorations = analysisResults.syntaxErrors.map((error: { line: number; message: string; }) => ({
                    range: new vscode.Range(new vscode.Position(error.line, 0), new vscode.Position(error.line, document.lineAt(error.line).range.end.character)),
                    hoverMessage: error.message
                }));
                console.log("Syntax Error Decorations:", syntaxErrorDecorations);
                editor.setDecorations(errorDecorationType, syntaxErrorDecorations);

                vscode.window.showErrorMessage(`❌ SQL analysis found syntax errors. Please correct them and try again.`);
                return;
            }

            // Apply decorations for code smells if no errors
            const codeSmellDecorations = analysisResults.codeSmells.map((smell: { line: number; message: string; }) => ({
                range: new vscode.Range(new vscode.Position(smell.line, 0), new vscode.Position(smell.line, document.lineAt(smell.line).range.end.character)),
                hoverMessage: smell.message
            }));
            console.log("Code Smell Decorations:", codeSmellDecorations);
            editor.setDecorations(codeSmellDecorationType, codeSmellDecorations);

            vscode.window.showInformationMessage(`✅ Analysis completed.`);

            // Show the diagram only if requested
            if (showDiagram) {
                createWebviewPanel(analysisResults.diagram, analysisResults.codeSmells);
            }
        }
    });
}

function createWebviewPanel(diagramContent: string, codeSmells: { line: number, message: string }[]) {
    const panel = vscode.window.createWebviewPanel(
        'sqlAnalyzer',
        'SQL Analyzer Diagram',
        vscode.ViewColumn.Beside, // Open the panel beside the current view
        {
            enableScripts: true,
        }
    );

    const codeSmellsHTML = codeSmells.map(smell => `<p>Line ${smell.line + 1}: ${smell.message}</p>`).join("");

    panel.webview.html = getWebviewContent(diagramContent, codeSmellsHTML);

    // Use setTimeout to delay focusing the current editor
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

async function analyzeWithCredentials(query: string, document: vscode.TextDocument, showDiagram: boolean, forcePrompt: boolean) {
    try {
        const credentials = await promptForCredentialsIfNeeded(forcePrompt);
        analyzeSQL(query, document, showDiagram, credentials);
    } catch (error) {
        vscode.window.showErrorMessage('❌ Failed to get database credentials.');
        analyzeSQL(query, document, showDiagram, { host: '', port: '', user: '', password: '', database: '' }); // Continue without DB credentials
    }
}

export function activate(context: vscode.ExtensionContext) {
    const config = vscode.workspace.getConfiguration('sqlAnalyzer');
    const realTimeAnalysis = config.get('realTimeAnalysis', false);

    // Initialize executions count if not already set
    if (config.get('executionsCount') === undefined) {
        config.update('executionsCount', 0, vscode.ConfigurationTarget.Global);
    }

    // Manual command for full analysis (with diagrams)
    let disposable = vscode.commands.registerCommand('extension.analyzeSQL', () => {
        const editor = vscode.window.activeTextEditor;
        if (editor) {
            const document = editor.document;
            const query = document.getText();

            if (document.languageId === 'sql') {
                analyzeWithCredentials(query, document, true, false); // true to show diagrams, false to not force prompt
            } else {
                vscode.window.showErrorMessage('❌ The active document is not a SQL file.');
            }
        } else {
            vscode.window.showErrorMessage('❌ No active editor found.');
        }
    });

    context.subscriptions.push(disposable);

    // Real-time analysis on save (without diagrams)
    if (realTimeAnalysis) {
        let onSaveDisposable = vscode.workspace.onDidSaveTextDocument((document) => {
            if (document.languageId === 'sql') {
                const query = document.getText();
                analyzeWithCredentials(query, document, false, false); // false to not show diagrams, false to not force prompt
            }
        });

        context.subscriptions.push(onSaveDisposable);
    }

    // Command to update credentials
    let updateCredentialsDisposable = vscode.commands.registerCommand('extension.updateDBCredentials', async () => {
        await getDBCredentials();
        vscode.window.showInformationMessage('🔑 Database credentials updated.');
    });

    context.subscriptions.push(updateCredentialsDisposable);
}

export function deactivate() {}
