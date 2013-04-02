grammar Contact;

prog        :  (stat)+ EOF;

// this should really be expr
/*  connection_selector might be better off somewhere else, as some commands
    don't make sense with it */
stat        :  assignment? (connect |
                            use |
                            using |
                            op_with_options |
                            listbuckets |
                            console_op |
                            connections) connection_selector? SEMI;

connection_selector:
    AT connname=ID;

console_op: get | set | loadscript | script;

connections: CONNS;

assignment: LET name=ID EQUALS;

using       :   USING BUCKET bucket=STRING op_with_options;

with        :   (WITH | AND);

op_with_options: (  fetch     |
                    store     |
                    delete    |
                    query2i   |
                    listkeys  |
                    countkeys |
                    get_bucketprops
                  ) options?;

options: with OPTIONS (optionslist | ID);

listbuckets:   LIST BUCKETS;

listkeys:      LIST KEYS;

countkeys:     COUNT KEYS;

optionslist: opts+=pair (COMMA opts+=pair)*;

fetch:    FETCH key=STRING; 
                
store:    STORE (key=STRING | existing_obj=ID) store_indexes with content_string;

//show:     SHOW ID? (with DETAIL)?;

store_indexes: (with INDEX pair)*;

content_string: (TEXT | JSON | XML) (STRING | DATA_CONTENT);

delete:    DELETE key=STRING;

query2i: QUERY2I (AND FETCH)? with INDEX index=STRING
            (with VALUE exact=STRING | FROM vmin=STRING TO vmax=STRING);

use:    USE ( (BUCKET name=STRING useBucketOptions?)
              | (CONN var=ID) );

useBucketOptions:
        (with FETCH OPTIONS fetchOptions=optionslist)?
        (with STORE OPTIONS storeOptions=optionslist)?
        (with DELETE OPTIONS deleteOptions=optionslist)?
        (with QUERY2I OPTIONS query2iOptions=optionslist)?
        ;

get_bucketprops: GET PROPERTIES;

connect: CONNECT (DEFAULT | host=STRING PB pbport=INT (HTTP httpport=INT)?) (AS connname=ID)?;

set: SET set_action;
set_action: ACTION actionname=ID WITH code_string;

get: GET (get_action | BUCKET);

get_action: ACTION actionname=ID;


loadscript: LOAD SCRIPT filename=STRING;
script: SCRIPT content=(STRING | DATA_CONTENT);

pair: (name=STRING | id=ID) EQUALS pairValue;

pairValue: stringValue=STRING #PairStringValue 
            | intValue=INT    #PairIntValue
            | boolValue=bool  #PairBoolValue
            ;

code_string: JAVASCRIPT (STRING | DATA_CONTENT);

bool : TRUE | FALSE;

LET         :    'let';
PB          :    'pb';
HTTP        :    'http';
FETCH       :    'fetch';
STORE       :    'store';
DELETE      :    'delete';
VALUE       :    'value';
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
AT          :    '@';
COMMA       :    ',';
LSQUARE     :    '[';
RSQUARE     :    ']';
LPAREN      :    '(';
RPAREN      :    ')';
EQUALS      :    '=';
DOT         :    '.';
SEMI        :    ';';
ID          :       LOWER (UPPER | LOWER)*;

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
