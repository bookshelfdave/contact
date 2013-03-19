grammar Contact;

prog        :  (stat)+ EOF;

// this should really be expr
stat        :  assignment? (connect | using | op_with_options | use | listbuckets | console_op) SEMI;

console_op: get | set | show;

assignment: LET name=ID EQUALS;

using       :   USING BUCKET bucket=STRING op_with_options;

with        :   (WITH | AND);

op_with_options: (fetch | store | delete | query2i | mapred | listkeys) options?;

options: with OPTIONS (optionslist | ID);

listbuckets:   LIST BUCKETS;

listkeys:      LIST KEYS;

optionslist: opts+=pair (COMMA opts+=pair)*;

fetch:    FETCH key=STRING; 
                
store:    STORE (key=STRING | existing_obj=ID) store_indexes with content_string;

show:     SHOW ID? (with DETAIL)?;

store_indexes: (with INDEX pair)*;

content_string: (TEXT | JSON | XML) (STRING | DATA_CONTENT);

delete:    DELETE key=STRING;

query2i: QUERY2I with INDEX index=STRING 
            (with VALUE exact=STRING | FROM vmin=STRING TO vmax=STRING);

// TODO: options
mapred: MAPRED WITH (mapred_inputs | mapred_bucket) mapred_phase+;

mapred_bucket: BUCKET name=STRING;

mapred_phase: with PHASE (with FILTERS mapred_keyfilters)? 
              with mapred_lang mapred_phase_type (mapred_phase_keep)? DATA_CONTENT;

mapred_phase_type: MAP #MapRedPhaseTypeMap 
                 | REDUCE #MapRedPhaseTypeReduce 
                 | LINK #MapRedPhaseTypeLink ;

mapred_phase_keep: KEEP;

mapred_inputs: INPUTS ins+=pair (COMMA ins+=pair)*;

mapred_input_join: AND | OR | NOT;

mapred_lang: JAVASCRIPT #MapRedLangJavascript
           | ERLANG     #MapRedLangErlang;

mapred_keyfilters: mapred_keyfilter (mapred_input_join mapred_keyfilter)* (COMMA mapred_keyfilter)*;

mapred_keyfilter: ID LPAREN mapred_keyfilter_args? RPAREN ;

mapred_keyfilter_args: mapred_keyfilter_arg (COMMA mapred_keyfilter_arg)*;

mapred_keyfilter_arg: (STRING | INT | bool);

use:    USE ( (BUCKET name=STRING) 
              | (CONN var=ID) );

connect: CONNECT (DEFAULT | host=STRING PB pbport=INT (HTTP httpport=INT)?);

set: SET set_action;
set_action: ACTION actionname=ID WITH code_string;

get: GET (get_action | get_bucketprops);
get_action: ACTION actionname=ID;
get_bucketprops: BUCKET PROPERTIES;

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
CONNECT     :    'connect';
USE         :    'use';
USING       :    'using';
WITH        :    'with';
BUCKET      :    'bucket';
AND         :    'and';
OR          :    'or';
NOT         :    'not';
OPTIONS     :    'options';
QUERY2I     :    'query2i';
MAP         :    'map';
REDUCE      :    'reduce';
LINK        :    'link';
MAPRED      :    'mapred';
FROM        :    'from';
INDEX       :    'index';
TO          :    'to';
INPUTS      :    'inputs';
FILTERS     :    'filters';
KEEP        :    'keep';
JAVASCRIPT  :    'javascript';
ERLANG      :    'erlang';
JAVA        :    'java';
PHASE       :    'phase';
SHOW        :    'show';
DETAIL      :    'detail';
PROPERTIES  :    'properties';

LIST        :    'list';
BUCKETS     :    'buckets';
KEYS        :    'keys';

TRUE        :    'true';
FALSE       :    'false';

//FOR         :    'for';
//IN          :    'in';
//PRINT       :    'print';
DEFAULT     :    'default';

SET         :    'set';
GET         :    'get';
ACTION      :    'action';

JSON        :    'json';
TEXT        :    'text';
XML         :    'xml';

COMMA       :    ',';
LSQUARE     :    '[';
RSQUARE     :    ']';
LPAREN      :    '(';
RPAREN      :    ')';
EQUALS      :    '=';
SEMI        :    ';';
ID          :       [a-z][A-Za-z_]*;
INT         :       [0-9]+;

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

// scissors op, dude riding a pterodactyl, drunken bird
DATA_CONTENT: '~%~' (DATA_ESC|.)*? '~%~';
fragment DATA_ESC: '\\~%~' | '\\~%~';


LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
