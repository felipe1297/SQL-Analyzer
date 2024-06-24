grammar postgreSqlGrammar;

options {
	caseInsensitive = true;
}

// Reglas Sintácticas
sql_stmt:
	select_stmt SEMI
	| function_stmt SEMI
	| create_table_stmt SEMI
	| create_index_stmt SEMI
	| create_database_stmt SEMI
	| drop_stmt SEMI
	| alter_table_stmt SEMI
	| insert_stmt SEMI
	| update_stmt SEMI
	| delete_stmt SEMI;

select_stmt: (WITH with_clause)? SELECT (DISTINCT)? (
		STAR
		| (result_column (COMMA result_column)*)
	) FROM table_reference (join_clause)* (WHERE expr)? (
		group_by_clause
	)? (order_by_clause)?;

function_stmt:
	CREATE FUNCTION ID LPAREN function_params? RPAREN RETURNS ID AS func_body;

data_type:
	VARCHAR LPAREN NUMBER RPAREN
	| INT
	| NUMERIC LPAREN NUMBER COMMA NUMBER RPAREN
	| TEXT
	| DATE
	| TIMESTAMP
	| BOOL
	| SERIAL
	| BIGSERIAL
	| UUID
	| JSON
	| JSONB
	| BYTEA
	| FLOAT
	| REAL
	| DOUBLE
	| DECIMAL LPAREN NUMBER COMMA NUMBER RPAREN
	| MONEY
	| SMALLINT
	| BIGINT
	| CHAR LPAREN NUMBER RPAREN
	| BIT LPAREN NUMBER RPAREN
	| INTERVAL
	| AUTOINCREMENT;

function_params: ID data_type (COMMA ID data_type)*;

func_body: expr;

create_table_stmt:
	CREATE (IF NOT EXISTS)? TABLE table_name LPAREN column_def (
		COMMA column_def
	)* (COMMA table_constraint)* RPAREN;

column_def: ID data_type (column_constraint)*;

column_constraint:
	NOT NULL
	| UNIQUE
	| PRIMARY KEY
	| DEFAULT expr;

table_constraint:
	PRIMARY KEY LPAREN column_list RPAREN
	| UNIQUE LPAREN column_list RPAREN
	| FOREIGN KEY LPAREN column_list RPAREN REFERENCES table_name LPAREN column_list RPAREN;

column_list: ID (COMMA ID)*;

create_index_stmt:
	CREATE (UNIQUE)? INDEX (IF NOT EXISTS)? ID ON table_name LPAREN column_list RPAREN;

create_database_stmt: CREATE (IF NOT EXISTS)? DATABASE ID;

drop_stmt:
	DROP (TABLE | INDEX | DATABASE | FUNCTION) (IF EXISTS)? ID;

alter_table_stmt:
	ALTER TABLE (IF EXISTS)? table_name alter_table_action;

alter_table_action:
	ADD COLUMN column_def
	| DROP COLUMN (IF EXISTS)? ID
	| RENAME COLUMN ID TO ID
	| ADD CONSTRAINT table_constraint;

insert_stmt:
	INSERT INTO table_name (LPAREN column_list RPAREN)? VALUES insert_values (
		COMMA insert_values
	)*
	| INSERT INTO table_name (LPAREN column_list RPAREN)? select_stmt;

insert_values: LPAREN value (COMMA value)* RPAREN;

update_stmt:
	UPDATE table_name SET update_assignment (
		COMMA update_assignment
	)* (WHERE expr)?;

update_assignment: ID EQ value;

delete_stmt: DELETE FROM table_name (WHERE expr)?;

value: STRING | NUMBER | NULL | expr;

limit_offset_clause: (OFFSET expr ROWS)? (
		FETCH FIRST expr ROWS ONLY
	)?;

with_clause: WITH cte (COMMA cte)*;

cte: ID AS LPAREN select_stmt RPAREN;

result_column:
	STAR
	| table_reference DOT STAR
	| table_reference DOT ID
	| ID
	| agg_func
	| ID LPAREN RPAREN;

join_clause: standard_join | natural_join;

standard_join: join_type table_reference ON expr;

natural_join: natural_join_type table_reference;

join_type:
	INNER JOIN
	| LEFT JOIN
	| RIGHT JOIN
	| FULL JOIN
	| JOIN;

natural_join_type:
	NATURAL JOIN
	| NATURAL INNER JOIN
	| NATURAL LEFT JOIN
	| NATURAL RIGHT JOIN
	| NATURAL FULL JOIN;

table_reference: table_name (alias)?;

table_name: ID;

alias: (AS ID) | ID;

group_by_clause:
	GROUP BY group_by_item (COMMA group_by_item)* (HAVING expr)?;

group_by_item: ID | table_reference DOT ID | agg_func;

order_by_clause: ORDER BY order_by_item (COMMA order_by_item)*;

order_by_item:
	ID (ASC | DESC)?
	| table_reference DOT ID (ASC | DESC)?;

agg_func:
	COUNT LPAREN (STAR | expr) RPAREN
	| SUM LPAREN expr RPAREN
	| AVG LPAREN expr RPAREN
	| MIN LPAREN expr RPAREN
	| MAX LPAREN expr RPAREN
	| ARRAY_AGG LPAREN expr RPAREN
	| STRING_AGG LPAREN expr COMMA STRING RPAREN
	| BOOL_AND LPAREN expr RPAREN
	| BOOL_OR LPAREN expr RPAREN
	| VAR_POP LPAREN expr RPAREN
	| VAR_SAMP LPAREN expr RPAREN
	| STDDEV_POP LPAREN expr RPAREN
	| STDDEV_SAMP LPAREN expr RPAREN
	| ID LPAREN RPAREN;

expr:
	expr AND expr
	| expr OR expr
	| NOT expr
	| arith_expr
	| ID (EQ | NEQ | LT | LTE | GT | GTE) (STRING | NUMBER)
	| ID IS (NOT)? NULL
	| ID LIKE STRING
	| ID BETWEEN expr AND expr
	| LPAREN select_stmt RPAREN
	| case_expr
	| function_call;

arith_expr:
	arith_expr PLUS arith_expr
	| arith_expr MINUS arith_expr
	| arith_expr STAR arith_expr
	| arith_expr SLASH arith_expr
	| atom;

atom: ID | NUMBER | LPAREN arith_expr RPAREN;

case_expr: CASE when_clause+ (ELSE (expr | NULL))? END;

when_clause: WHEN expr THEN expr;

function_call:
	ID LPAREN (function_arg (COMMA function_arg)*)? RPAREN;

function_arg: expr;

// Reglas Léxicas
fragment IdentifierStartChar:
	[a-z_]
	| [\u0100-\uD7FF\uE000-\uFFFF];
fragment IdentifierChar: IdentifierStartChar | [0-9] | '$';
ID: IdentifierStartChar IdentifierChar*;

VARCHAR: 'VARCHAR';
INT: 'INT';
NUMERIC: 'NUMERIC';
TEXT: 'TEXT';
DATE: 'DATE';
TIMESTAMP: 'TIMESTAMP';
BOOL: 'BOOL';
SERIAL: 'SERIAL';
BIGSERIAL: 'BIGSERIAL';
UUID: 'UUID';
JSON: 'JSON';
JSONB: 'JSONB';
BYTEA: 'BYTEA';
FLOAT: 'FLOAT';
REAL: 'REAL';
DOUBLE: 'DOUBLE';
DECIMAL: 'DECIMAL';
MONEY: 'MONEY';
SMALLINT: 'SMALLINT';
BIGINT: 'BIGINT';
CHAR: 'CHAR';
BIT: 'BIT';
INTERVAL: 'INTERVAL';
AUTOINCREMENT: 'AUTOINCREMENT';

SELECT: 'SELECT';
WITH: 'WITH';
FROM: 'FROM';
WHERE: 'WHERE';
GROUP: 'GROUP';
BY: 'BY';
HAVING: 'HAVING';
ORDER: 'ORDER';
ASC: 'ASC';
DESC: 'DESC';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
AS: 'AS';
ON: 'ON';
IS: 'IS';
NULL: 'NULL';
LIKE: 'LIKE';
BETWEEN: 'BETWEEN';
NATURAL: 'NATURAL';
CASE: 'CASE';
WHEN: 'WHEN';
THEN: 'THEN';
ELSE: 'ELSE';
END: 'END';
CREATE: 'CREATE';
FUNCTION: 'FUNCTION';
RETURNS: 'RETURNS';
INNER: 'INNER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
FULL: 'FULL';
JOIN: 'JOIN';
COUNT: 'COUNT';
SUM: 'SUM';
AVG: 'AVG';
MIN: 'MIN';
MAX: 'MAX';
ARRAY_AGG: 'ARRAY_AGG';
STRING_AGG: 'STRING_AGG';
BOOL_AND: 'BOOL_AND';
BOOL_OR: 'BOOL_OR';
VAR_POP: 'VAR_POP';
VAR_SAMP: 'VAR_SAMP';
STDDEV_POP: 'STDDEV_POP';
STDDEV_SAMP: 'STDDEV_SAMP';
OFFSET: 'OFFSET';
FETCH: 'FETCH';
FIRST: 'FIRST';
ROWS: 'ROWS';
ONLY: 'ONLY';
DISTINCT: 'DISTINCT';

TABLE: 'TABLE';
UNIQUE: 'UNIQUE';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
DEFAULT: 'DEFAULT';
FOREIGN: 'FOREIGN';
REFERENCES: 'REFERENCES';
INDEX: 'INDEX';
DROP: 'DROP';
ALTER: 'ALTER';
RENAME: 'RENAME';
CONSTRAINT: 'CONSTRAINT';
TO: 'TO';
ADD: 'ADD';
COLUMN: 'COLUMN';
DATABASE: 'DATABASE';

IF: 'IF';
EXISTS: 'EXISTS';

STRING: '\'' ( ~'\'' | '\'\'')* '\'';
NUMBER: [0-9]+;
STAR: '*';
COMMA: ',';
SEMI: ';';
DOT: '.';
LPAREN: '(';
RPAREN: ')';
EQ: '=';
NEQ: '!=';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';

PLUS: '+';
MINUS: '-';
SLASH: '/';

INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
UPDATE: 'UPDATE';
SET: 'SET';
DELETE: 'DELETE';

LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;