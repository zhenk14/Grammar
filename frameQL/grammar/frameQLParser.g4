parser grammar frameQLParser;
options { tokenVocab=frameQLLexer;}


root
    : fqlStatements? EOF
;

fqlStatements
    : (fqlStatement SEMI | emptyStatement)*
    (fqlStatement (SEMI)? | emptyStatement)
;

emptyStatement
    : SEMI
;


fqlStatement
    : dmlStatement 
;

dmlStatement
	:selectStatement
;


selectStatement
    : querySpecification                    #simpleSelect
;

querySpecification
    : SELECT selectSpec* selectElements
      fromClause?
;



//select specifications
selectSpec
    : (ALL | DISTINCT)
;

//doesn't support star for now
selectElements
    : (selectElement ) (',' selectElement)*
;

selectElement
    : fullColumnName                                     #selectColumnElement
    ;

fullColumnName
    : ID
;
//from Clause
fromClause
    : FROM tableSources
;




//tableSources and table
tableSources
    : tableSource (',' tableSource)*
;


tableSource
    : tableSourceItem                                      #tableSourceBase
;


tableSourceItem
    : tableName
;


tableName
    : ID
;
