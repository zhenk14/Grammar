lexer grammar frameQLLexer;


channels { MYSQLCOMMENT, ERRORCHANNEL }
SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);
SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(MYSQLCOMMENT);
COMMENT_INPUT: '/*' .*? '*/' -> channel(HIDDEN);



// Keywords
// Common Keywords

SELECT: 'SELECT';	
FROM: 'FROM';
WHERE: 'WHERE';
AND: 'AND';
GROUP: 'GROUP';
HAVING: 'HAVING';
DISTINCT: 'DISTINCT';
ALL: 'ALL';


// Operators. Comparation

EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL: '!';



// Constructors symbols

DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
COMMA:                               ',';
SEMI:                                ';';
AT_SIGN:                             '@';
ZERO_DECIMAL:                        '0';
ONE_DECIMAL:                         '1';
TWO_DECIMAL:                         '2';
SINGLE_QUOTE_SYMB:                   '\'';
DOUBLE_QUOTE_SYMB:                   '"';
REVERSE_QUOTE_SYMB:                  '`';
COLON_SYMB:                          ':';


ID: ID_LITERAL;



//fragments used by lexer rules
fragment ID_LITERAL: [A-Z_$0-9]*?[A-Z_$]+?[A-Z_$0-9]*;