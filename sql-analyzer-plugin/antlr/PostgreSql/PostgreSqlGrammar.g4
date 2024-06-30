grammar PostgreSqlGrammar;

initial: sql_stmt (sql_stmt)*;

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

select_stmt: LPAREN select_stmt RPAREN | ((WITH with_clause)? SELECT (DISTINCT)? (
		STAR
		| (result_column (COMMA result_column)*)
	) FROM table_reference (COMMA table_reference)* (join_clause)* (WHERE expr)? (
		group_by_clause
	)? (order_by_clause)? limit_offset_clause);

limit_offset_clause
: (LIMIT  (expr | NUMBER)  (OFFSET expr)?)?
| (OFFSET (expr | NUMBER))?
| (FETCH FIRST expr ROWS ONLY)?
;

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

with_clause: WITH cte (COMMA cte)*;

cte: ID AS LPAREN select_stmt RPAREN;

result_column:
	table_reference
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

table_reference: table_name (alias)?
    | LPAREN select_stmt RPAREN (alias)?;

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
	| (STRING | NUMBER | (ID (DOT ID)?)) (EQ | NEQ | LT | LTE | GT | GTE) (STRING | NUMBER | (ID (DOT ID)?))
	| ID IS (NOT)? NULL
	| ID LIKE STRING
	| ID BETWEEN expr AND expr
	| LPAREN select_stmt RPAREN
	| case_expr
	| function_call ((EQ | NEQ | LT | LTE | GT | GTE) (expr | STRING | NUMBER | (ID (DOT ID)?)))?;

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
	ID LPAREN (function_arg (COMMA function_arg)*)? RPAREN
        | LEN LPAREN expr RPAREN
        | UPPER LPAREN expr RPAREN
        | LOWER LPAREN expr RPAREN
        | SUBSTRING LPAREN expr COMMA INT COMMA INT RPAREN
        | ABS LPAREN expr RPAREN
        | CEILING LPAREN expr RPAREN
        | FLOOR LPAREN expr RPAREN
        | ROUND LPAREN expr COMMA INT RPAREN
        | YEAR LPAREN expr RPAREN
        | MONTH LPAREN expr RPAREN
        | DAY LPAREN expr RPAREN
        | GETDATE LPAREN RPAREN
        | DATEADD LPAREN expr COMMA INT COMMA expr RPAREN
        | DATEDIFF LPAREN expr COMMA expr COMMA expr RPAREN
        | CAST LPAREN expr AS data_type RPAREN
        | CONVERT LPAREN data_type COMMA expr RPAREN
        | SUM LPAREN expr RPAREN
        | AVG LPAREN expr RPAREN
        | COUNT LPAREN expr RPAREN
        | MIN LPAREN expr RPAREN
        | MAX LPAREN expr RPAREN;

function_arg: expr;

// Reglas Léxicas

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

VARCHAR: V A R C H A R;
INT: I N T;
NUMERIC: N U M E R I C;
TEXT: T E X T;
DATE: D A T E;
TIMESTAMP: T I M E S T A M P;
BOOL: B O O L;
SERIAL: S E R I A L;
BIGSERIAL: B I G S E R I A L;
UUID: U U I D;
JSON: J S O N;
JSONB: J S O N B;
BYTEA: B Y T E A;
FLOAT: F L O A T;
REAL: R E A L;
DOUBLE: D O U B L E;
DECIMAL: D E C I M A L;
MONEY: M O N E Y;
SMALLINT: S M A L L I N T;
BIGINT: B I G I N T;
CHAR: C H A R;
BIT: B I T;
INTERVAL: I N T E R V A L;
AUTOINCREMENT: A U T O I N C R E M E N T;

SELECT: S E L E C T;
WITH: W I T H;
FROM: F R O M;
WHERE: W H E R E;
GROUP: G R O U P;
BY: B Y;
HAVING: H A V I N G;
ORDER: O R D E R;
ASC: A S C;
DESC: D E S C;
AND: A N D;
OR: O R;
NOT: N O T;
AS: A S;
ON: O N;
IS: I S;
NULL: N U L L;
LIKE: L I K E;
BETWEEN: B E T W E E N;
NATURAL: N A T U R A L;
CASE: C A S E;
WHEN: W H E N;
THEN: T H E N;
ELSE: E L S E;
END: E N D;
CREATE: C R E A T E;
FUNCTION: F U N C T I O N;
RETURNS: R E T U R N S;
INNER: I N N E R;
LEFT: L E F T;
RIGHT: R I G H T;
FULL: F U L L;
JOIN: J O I N;
COUNT: C O U N T;
SUM: S U M;
AVG: A V G;
MIN: M I N;
MAX: M A X;
ARRAY_AGG: A R R A Y '_' A G G;
STRING_AGG: S T R I N G '_' A G G;
BOOL_AND: B O O L '_' A N D;
BOOL_OR: B O O L '_' O R;
VAR_POP: V A R '_' P O P;
VAR_SAMP: V A R '_' S A M P;
STDDEV_POP: S T D D E V '_' P O P;
STDDEV_SAMP: S T D D E V '_' S A M P;
OFFSET: O F F S E T;
FETCH: F E T C H;
FIRST: F I R S T;
ROWS: R O W S;
ONLY: O N L Y;
DISTINCT: D I S T I N C T;

TABLE: T A B L E;
UNIQUE: U N I Q U E;
PRIMARY: P R I M A R Y;
KEY: K E Y;
DEFAULT: D E F A U L T;
FOREIGN: F O R E I G N;
REFERENCES: R E F E R E N C E S;
INDEX: I N D E X;
DROP: D R O P;
ALTER: A L T E R;
RENAME: R E N A M E;
CONSTRAINT: C O N S T R A I N T;
TO: T O;
ADD: A D D;
COLUMN: C O L U M N;
DATABASE: D A T A B A S E;
LIMIT: L I M I T;

// Funciones de cadena
LEN: L E N;
UPPER: U P P E R;
LOWER: L O W E R;
SUBSTRING: S U B S T R I N G;

// Funciones numéricas
ABS: A B S;
CEILING: C E I L I N G;
FLOOR: F L O O R;
ROUND: R O U N D;

// Funciones de fecha y hora
YEAR: Y E A R;
MONTH: M O N T H;
DAY: D A Y;
GETDATE: G E T D A T E;
DATEADD: D A T E A D D;
DATEDIFF: D A T E D I F F;

// Funciones de conversión
CAST: C A S T;
CONVERT: C O N V E R T;

IF: I F;
EXISTS: E X I S T S;

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

INSERT: I N S E R T;
INTO: I N T O;
VALUES: V A L U E S;
UPDATE: U P D A T E;
SET: S E T;
DELETE: D E L E T E;

LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

ID : (LETTER | '_' | '$') (LETTER | DIGIT | '_' | '$')* ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;