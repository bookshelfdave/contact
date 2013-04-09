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
                            connections |
                            admin
                            ) connection_selector? SEMI;

connection_selector:
    AT connname=ID;

console_op: get | set | loadscript | script;

connections: CONNS;

assignment: LET name=ID EQUALS;

using       :   USING BUCKET bucket=STRING op_with_options;

with        :   (WITH | AND);

op_with_options: (  fetch           |
                    store           |
                    delete          |
                    query2i         |
                    listkeys        |
                    countkeys       |
                    bucketprops |
                    update
                  ) options?;

options: with OPTIONS (optionslist | ID);

listbuckets:   LIST BUCKETS;

listkeys:      LIST KEYS;

countkeys:     COUNT KEYS;

optionslist: opts+=pair (COMMA opts+=pair)*;

fetch:    FETCH key=STRING; 
                
store:    STORE (key=STRING | existing_obj=ID) store_indexes with content_string;

update: UPDATE;

//show:     SHOW ID? (with DETAIL)?;

store_indexes: (with INDEX pair)*;

content_string: (TEXT | JSON | XML | user_content) (STRING | DATA_CONTENT);

user_content: CONTENTTYPE content_type=STRING AND;

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
        (with RESOLVER code_string)?
        ;

bucketprops: (get_bucketprops | set_bucketprops);

get_bucketprops: GET PROPERTIES;
set_bucketprops: SET PROPERTIES optionslist;

connect: CONNECT host=STRING PB pbport=INT (HTTP httpport=INT)? (NODE erlnode=STRING)? (AS connname=ID)?;

set: SET set_action;
set_action: ACTION actionname=ID WITH code_string;

get: GET (get_action | BUCKET);

get_action: ACTION actionname=ID;

admin:
    ADMIN
    (connid = ID)
    (admin_join          |
    admin_leave          |
    admin_force_remove   |
    admin_replace        |
    admin_force_replace  |
    admin_plan           |
    admin_commit         |
    admin_clear);

admin_join:  JOIN nodeid=STRING;
admin_leave: LEAVE nodeid=STRING;
admin_force_remove: FORCE REMOVE nodeid=STRING;
admin_replace: REPLACE nodeida=STRING WITH nodeidb=STRING;
admin_force_replace: FORCE REPLACE nodeida=STRING WITH nodeidb=STRING;
admin_plan: PLAN;
admin_commit: COMMIT;
admin_clear: CLEAR;


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

AT          :    '@';
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
