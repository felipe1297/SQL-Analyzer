# SQL Analyzer Plugin

**Description**:
The SQL Analyzer Plugin for VSCode is designed to analyze SQL scripts, identify code smells, and provide suggestions for improvements directly within your editor. It leverages ANTLR for parsing SQL queries and offers various features such as complexity analysis, code smell detection, and execution plan visualization.

## Features

- **Analyze SQL Code**: Provides recommendations, diagrams, and analysis of SQL code.
- **Real-time Feedback**: Gives real-time feedback on SQL scripts directly within VSCode.
- **Execution Plan Visualization**: Displays execution plans to help understand query performance.

## Requirements

- Visual Studio Code (version 1.90.0 or higher)
- Node.js
- Python 3.x
- ANTLR 4.x

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/felipe1297/SQL-Analyzer
    cd sql-analyzer
    ```

2. **Install Node.js dependencies**:
    ```bash
    npm install
    ```

3. **Install Python dependencies**:
    ```bash
    pip install psycopg2 graphviz matplotlib antlr4-python3-runtime
    ```

4. **Build the extension**:
    ```bash
    npm run compile
    ```

5. **Install the extension in VSCode**:
    - Open VSCode
    - Go to the Extensions sidebar
    - Click on "Install from VSIX..." and select the generated `.vsix` file from the `out` directory7

##### NOTE: Follow this instructions to run the plugin https://www.youtube.com/watch?v=q5V4T3o3CXE&t=298s 

## Usage

### Commands

This extension contributes the following commands:

- `extension.analyzeSQL`: Analyze SQL
- `extension.updateDBCredentials`: Update Database Credentials
- `extension.showDBCredentials`: Show Database Credentials

### Configuration

The extension provides several settings to customize its behavior:

- `sqlAnalyzer.dbHost`: Database host for SQL Analyzer
- `sqlAnalyzer.dbPort`: Database port for SQL Analyzer (default: 5432)
- `sqlAnalyzer.dbUser`: Database user for SQL Analyzer
- `sqlAnalyzer.dbPassword`: Database password for SQL Analyzer
- `sqlAnalyzer.dbDatabase`: Database name for SQL Analyzer
- `sqlAnalyzer.realTimeAnalysis`: Enable real-time analysis of SQL files on save
- `sqlAnalyzer.validateWithDB`: Analyze with DB
- `sqlAnalyzer.showDiagram`: Show diagrams with the analysis

To configure these settings, go to the VSCode settings and search for "SQL Analyzer".

## Example

Here is a brief example of how to use the SQL Analyzer Plugin:

1. Open a SQL file in VSCode.
2. Press `Ctrl+Shift+P` to open the command palette.
3. Type `Analyze SQL` and select the `Analyze SQL` command.
4. View the analysis results, recommendations, and diagrams directly in the VSCode interface.

## Known Issues

- Integration with CI/CD pipeline is still under development.
- Real-time analysis might affect performance on large SQL files.

## Release Notes

### 0.0.1

- Initial release of SQL Analyzer Plugin.

## Development

### Prerequisites

Ensure you have the following installed:

- Node.js
- Python 3.x
- ANTLR 4.x

### Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/felipe1297/SQL-Analyzer
    cd sql-analyzer
    ```

2. Install Node.js dependencies:
    ```bash
    npm install
    ```

3. Install Python dependencies:
    ```bash
    pip install psycopg2 graphviz matplotlib antlr4-python3-runtime
    ```

4. Build the extension:
    ```bash
    npm run compile
    ```

5. Open the project in VSCode:
    ```bash
    code .
    ```

6. Start debugging (press `F5` in VSCode).

## License

This project is licensed under the Proprietary License. See the [LICENSE](LICENSE) file for details.

## Contact

For permission requests or further information, please contact:

Felipe Esteban Riaño Pineda  
Email: [friano@unal.edu.co](mailto:friano@unal.edu.co), [felipepineda1997@gmail.com](mailto:felipepineda1997@gmail.com)

**Enjoy!**
