grammar Contact;
import CommonLexerRules;

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
    (
      admin_join          |
      admin_leave          |
      admin_force_remove   |
      admin_replace        |
      admin_force_replace  |
      admin_plan           |
      admin_commit         |
      admin_clear          |
      admin_status         |
      admin_versions
    );

admin_status: STATUS;
admin_join:  JOIN noderef;
admin_leave: LEAVE noderef;
admin_force_remove: FORCE REMOVE noderef;
admin_replace: REPLACE nodea=noderef WITH nodeb=noderef;
admin_force_replace: FORCE REPLACE nodea=noderef WITH nodeb=noderef;
admin_plan: PLAN;
admin_commit: COMMIT;
admin_clear: CLEAR;
admin_versions: VERSIONS;

noderef: (nodename=STRING | nodeid=ID);

loadscript: LOAD SCRIPT filename=STRING;
script: SCRIPT content=(STRING | DATA_CONTENT);

pair: (name=STRING | id=ID) EQUALS pairValue;

pairValue: stringValue=STRING #PairStringValue 
            | intValue=INT    #PairIntValue
            | boolValue=bool  #PairBoolValue
            ;



code_string: JAVASCRIPT (STRING | DATA_CONTENT);

bool : TRUE | FALSE;

