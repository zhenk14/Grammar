import sys
from antlr4 import *
from frameQLParser import frameQLParser 
from frameQLLexer import frameQLLexer 
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = frameQLLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = frameQLParser(stream)
    tree = parser.root()
    print(tree.toStringTree(recog=parser))
 
if __name__ == '__main__':
    main(sys.argv)