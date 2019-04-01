#Grammar for frameQL
We built a grammar using ANTLR
##How to compile 
###Use ANTLR4 to construct the parser and the lexer
```
 antlr4 *.g4 -o ../build/
```

###Compile all java files in build
Go to ../build and execute:
```
javac -g frameQL*.java
```
##How to construct parse tree
in build, run:
```
grun frameQL root -gui
```
It will ask for inputs in the command prompt

Or we can provide input txt file via:
```
grun frameQL root -gui query.txt
```

In the end, grun will output the parse tree

##Problems
###No runtime environemnt
Just export CLASSPATH 	
```
export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
```