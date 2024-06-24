grammar postgreSqlGrammar;


// Reglas Sintácticas
sql_stmt : select_stmt SEMI
         | function_stmt SEMI
         ;

select_stmt
    : with_clause? SELECT (STAR | (result_column (COMMA result_column)*))
      FROM table_reference (join_clause)* (WHERE expr)? (group_by_clause)? (order_by_clause)?
    ;

function_stmt
    : CREATE FUNCTION ID LPAREN function_params? RPAREN RETURNS ID AS func_body
    ;

function_params
    : function_param (COMMA function_param)*
    ;

function_param
    : ID ID
    ;

func_body
    : expr
    ;

with_clause
    : WITH cte (COMMA cte)*
    ;

cte
    : ID AS LPAREN select_stmt RPAREN
    ;

result_column : STAR | table_reference DOT STAR | table_reference DOT ID | ID | agg_func | ID LPAREN RPAREN;

join_clause : standard_join | natural_join;

standard_join : join_type table_reference ON expr;

natural_join : natural_join_type table_reference;

join_type 
    : INNER JOIN 
    | LEFT JOIN
    | RIGHT JOIN
    | FULL JOIN
    | JOIN // Esto cubre el caso de INNER JOIN implícito
    ;

natural_join_type
    : NATURAL JOIN
    | NATURAL INNER JOIN
    | NATURAL LEFT JOIN
    | NATURAL RIGHT JOIN
    | NATURAL FULL JOIN
    ;

table_reference : table_name (alias)?;

table_name : ID;

alias : (AS ID) | ID;

group_by_clause
    : GROUP BY group_by_item (COMMA group_by_item)* (HAVING expr)?
    ;

group_by_item
    : ID | table_reference DOT ID | agg_func
    ;

order_by_clause
    : ORDER BY order_by_item (COMMA order_by_item)*
    ;

order_by_item
    : ID (ASC | DESC)? | table_reference DOT ID (ASC | DESC)?
    ;

agg_func
    : COUNT LPAREN (STAR | expr) RPAREN
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
    | ID LPAREN RPAREN
    ;

expr
    : expr AND expr
    | expr OR expr
    | NOT expr
    | ID (EQ | NEQ | LT | LTE | GT | GTE) (STRING | NUMBER)
    | ID IS (NOT)? NULL
    | ID LIKE STRING
    | ID BETWEEN expr AND expr
    | LPAREN select_stmt RPAREN  // Subconsulta en la cláusula WHERE
    | case_expr
    | function_call
    ;

case_expr
    : CASE when_clause+ (ELSE (expr | NULL))? END
    ;

when_clause
    : WHEN expr THEN expr
    ;

function_call
    : ID LPAREN (function_arg (COMMA function_arg)*)? RPAREN
    ;

function_arg
    : expr
    ;

// Reglas Léxicas
SELECT : 'SELECT';
WITH   : 'WITH';
FROM   : 'FROM';
WHERE  : 'WHERE';
GROUP  : 'GROUP';
BY     : 'BY';
HAVING : 'HAVING';
ORDER  : 'ORDER';
ASC    : 'ASC';
DESC   : 'DESC';
AND    : 'AND';
OR     : 'OR';
NOT    : 'NOT';
AS     : 'AS';
ON     : 'ON';
IS     : 'IS';
NULL   : 'NULL';
LIKE   : 'LIKE';
BETWEEN: 'BETWEEN';
NATURAL: 'NATURAL';
CASE   : 'CASE';
WHEN   : 'WHEN';
THEN   : 'THEN';
ELSE   : 'ELSE';
END    : 'END';
CREATE : 'CREATE';
FUNCTION : 'FUNCTION';
RETURNS: 'RETURNS';
INNER  : 'INNER';
LEFT   : 'LEFT';
RIGHT  : 'RIGHT';
FULL   : 'FULL';
JOIN   : 'JOIN';
COUNT  : 'COUNT';
SUM    : 'SUM';
AVG    : 'AVG';
MIN    : 'MIN';
MAX    : 'MAX';
ARRAY_AGG : 'ARRAY_AGG';
STRING_AGG : 'STRING_AGG';
BOOL_AND : 'BOOL_AND';
BOOL_OR  : 'BOOL_OR';
VAR_POP : 'VAR_POP';
VAR_SAMP : 'VAR_SAMP';
STDDEV_POP : 'STDDEV_POP';
STDDEV_SAMP : 'STDDEV_SAMP';
ID     : [a-zA-Z_][a-zA-Z0-9_]*;
STRING : '\'' ( ~'\'' | '\'\'' )* '\'';
NUMBER : [0-9]+;
STAR   : '*';
COMMA  : ',';
SEMI   : ';';
DOT    : '.';
LPAREN : '(';
RPAREN : ')';
EQ     : '=';
NEQ    : '!=';
LT     : '<';
LTE    : '<=';
GT     : '>';
GTE    : '>=';
LINE_COMMENT : '--' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
WS     : [ \t\r\n]+ -> skip;
