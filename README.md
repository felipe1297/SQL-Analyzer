# SQL Analyzer

**Description**:
The SQL Analyzer is a tool designed to analyze SQL scripts, identify code smells, and provide suggestions for improvements. It leverages ANTLR for parsing SQL queries and evaluating their structure. This project is currently envisioned as both a plugin for VSCode and a component in a CI/CD pipeline.

## Features
- **Complexity Analysis**: Assess the complexity of SQL queries to identify potential performance bottlenecks.
- **Code Smell Detection**: Identify common code smells in SQL queries that indicate suboptimal practices or potential inefficiencies.
- **Execution Plan Visualization**: Generate and display a diagram of the SQL query execution plan for better understanding.
- **ANTLR-based Parsing**: Utilize ANTLR for precise and robust parsing of SQL queries.

## Installation
### Prerequisites
- Python 3.x
- ANTLR 4.x

### Setup
1. **Clone the repository**:
    ```bash
    git clone https://your-repo-url.git
    cd sql-analyzer
    ```

2. **Install dependencies**:
    ```bash
    pip install -r requirements.txt
    ```

3. **Run the analyzer**:
    ```bash
    python main.py
    ```

## Usage
### As a VSCode Plugin
This project is planned to be developed as a VSCode plugin to provide real-time feedback on SQL scripts directly within the editor. Stay tuned for updates on the plugin development.

### As a CI/CD Pipeline Component
Integrate the SQL Analyzer into your CI/CD pipeline to automatically analyze and report on the SQL scripts in your project. This ensures that only well-optimized and clean SQL code is deployed.

## License
This project is licensed under the Proprietary License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments
This project was developed as part of the Systems and Computer Engineering program at the National University of Colombia - Bogotá Campus (Universidad Nacional de Colombia - Sede Bogotá). The knowledge and skills used to create this tool were acquired through the coursework and guidance provided in the program.

## Authors
- **Felipe Esteban Riaño Pineda**
  - Email: [friano@unal.edu.co](mailto:friano@unal.edu.co), [felipepineda1997@gmail.com](mailto:felipepineda1997@gmail.com)
- *Add other authors here as needed*

## Contact
For permission requests or further information, please contact:

Felipe Esteban Riaño Pineda  
Email: [friano@unal.edu.co](mailto:friano@unal.edu.co), [felipepineda1997@gmail.com](mailto:felipepineda1997@gmail.com)
