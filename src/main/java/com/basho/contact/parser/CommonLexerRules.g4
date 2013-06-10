lexer grammar CommonLexerRules;

LET         :    'let';
PB          :    'pb';
HTTP        :    'http';
FETCH       :    'fetch';
STORE       :    'store';
UPDATE      :    'update';
DELETE      :    'delete';
VALUE       :    'value';
CONTENTTYPE :    'content-type';
CONN        :    'connection';
CONNS       :    'connections';
CONNECT     :    'connect';
USE         :    'use';
USING       :    'using';
WITH        :    'with';
AND         :    'and';
BUCKET      :    'bucket';
OPTIONS     :    'options';
QUERY2I     :    'query2i';
COUNT       :    'count';
FROM        :    'from';
INDEX       :    'index';
TO          :    'to';
JAVASCRIPT  :    'javascript';
PROPERTIES  :    'properties';
RESOLVER    :    'resolver';
LOAD        :    'load';
SCRIPT      :    'script';
LIST        :    'list';
BUCKETS     :    'buckets';
KEYS        :    'keys';
TRUE        :    'true';
FALSE       :    'false';
DEFAULT     :    'default';
SET         :    'set';
GET         :    'get';
ACTION      :    'action';
AS          :    'as';
JSON        :    'json';
TEXT        :    'text';
XML         :    'xml';
NODE        :    'node';
VERSIONS    :    'versions';
DISCOVER    :    'discover';
CLUSTER     :    'cluster';

// admin stuff
ADMIN       :    'admin';
JOIN        :    'join';
LEAVE       :    'leave';
FORCE       :    'force';
REMOVE      :    'remove';
REPLACE     :    'replace';
PLAN        :    'plan';
COMMIT      :    'commit';
CLEAR       :    'clear';
STATUS      :    'status';

AT          :    '@';
DOLLAR      :    '$';
SPLAT       :    '*';
COMMA       :    ',';
LSQUARE     :    '[';
RSQUARE     :    ']';
LPAREN      :    '(';
RPAREN      :    ')';
EQUALS      :    '=';
DOT         :    '.';
SEMI        :    ';';
ID          :       LOWER (UPPER | LOWER | DIGIT | '_')*;




fragment LOWER : 'a' .. 'z';
fragment UPPER : 'A' .. 'Z';

INT             :   DIGIT+;
fragment DIGIT  : '0' .. '9';

FLOAT       :       DIGIT+ DOT DIGIT*
                    | DOT DIGIT+
                       ;

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

// scissors op, dude riding a pterodactyl, drunken bird
DATA_CONTENT: '~%~' (DATA_ESC|.)*? '~%~';
fragment DATA_ESC: '\\~%~' | '\\~%~';


LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
