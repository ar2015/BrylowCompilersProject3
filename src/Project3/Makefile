PARSER   = Parser

JAVAC    = javac
JAVA     = java
JAVACC   = javacc
JJDOC    = jjdoc

JAVACC_FLAGS = -NOSTATIC

JAVACCGEN = Parse/SimpleCharStream.java Parse/ParseException.java \
        Parse/$(PARSER).java Parse/$(PARSER)Constants.java \
        Parse/$(PARSER)TokenManager.java Parse/Token.java \
        Parse/TokenMgrError.java

ABSYN    = Absyn/Absyn.java Absyn/AddExpr.java \
	Absyn/AndExpr.java Absyn/ArrayType.java \
	Absyn/AssignableExpr.java Absyn/AssignStmt.java \
	Absyn/BinOpExpr.java Absyn/BlockStmt.java \
	Absyn/BooleanType.java Absyn/CallExpr.java \
	Absyn/ClassDecl.java Absyn/DivExpr.java \
	Absyn/EqualExpr.java Absyn/Expr.java \
	Absyn/FalseExpr.java Absyn/FieldExpr.java \
	Absyn/Formal.java Absyn/GreaterExpr.java \
	Absyn/IdentifierExpr.java Absyn/IdentifierType.java \
        Absyn/LesserExpr.java Absyn/MethodDecl.java \
	Absyn/NewArrayExpr.java Absyn/NewObjectExpr.java \
        Absyn/NotEqExpr.java Absyn/NotExpr.java \
	Absyn/NullExpr.java Absyn/Stmt.java \
        Absyn/StringLiteral.java Absyn/ThisExpr.java \
	Absyn/ThreadDecl.java Absyn/TrueExpr.java \
        Absyn/VarDecl.java Absyn/VoidDecl.java \
	Absyn/WhileStmt.java Absyn/XinuCallExpr.java \
        Absyn/XinuCallStmt.java Absyn/AssignStmt.java 
        

VISIT    = Visit/Visitable.java Visit/Visitor.java \
         Visit/AbsynPrintVisitor.java 
        
       

SRCS     = $(ABSYN) $(VISIT) $(PARSER).java Parse/Main.java

all:  $(SRCS:.java=.class)

%.class : %.java
	$(JAVAC) $<



$(PARSER).java: $(PARSER).jj
	$(JAVACC) $(JAVACC_FLAGS) $<

parser: $(PARSER).class $(PARSER)Constants.class \
        $(PARSER)TokenManager.class ParseException.class

main: $(PARSER).class Main.class

clean:        
	rm -f $(SRCS:.java=.class) ${JAVACCGEN} $(JAVACCGEN:.java=.class)

