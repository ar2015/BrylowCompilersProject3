PARSER   = Parser

JAVAC    = javac
JAVA     = java
JAVACC   = javacc
JJDOC    = jjdoc

JAVACC_FLAGS = -NOSTATIC

JAVACCGEN = SimpleCharStream.java ParseException.java \
        $(PARSER).java $(PARSER)Constants.java \
        $(PARSER)TokenManager.java Token.java \
        TokenMgrError.java

ABSYN    = Parse/Absyn/Absyn.java Parse/Absyn/AddExpr.java \
	Parse/Absyn/AndExpr.java Parse/Absyn/ArrayType.java \
	Parse/Absyn/AssignableExpr.java Parse/Absyn/AssignStmt.java \
	Parse/Absyn/BinOpExpr.java Parse/Absyn/BlockStmt.java \
	Parse/Absyn/BooleanType.java Parse/Absyn/CallExpr.java \
	Parse/Absyn/ClassDecl.java Parse/Absyn/DivExpr.java \
	Parse/Absyn/EqualExpr.java Parse/Absyn/Expr.java \
	Parse/Absyn/FalseExpr.java Parse/Absyn/FieldExpr.java \
        Parse/Absyn/Formal.java Parse/Absyn/GreaterExpr.java \
	Parse/Absyn/IdentifierExpr.java Parse/Absyn/IdentifierType.java \
        Parse/Absyn/LesserExpr.java Parse/Absyn/MethodDecl.java \
	Parse/Absyn/NewArrayExpr.java Parse/Absyn/NewObjectExpr.java \
        Parse/Absyn/NotEqExpr.java Parse/Absyn/NotExpr.java \
	Parse/Absyn/NullExpr.java Parse/Absyn/Stmt.java \
        Parse/Absyn/StringLiteral.java Parse/Absyn/ThisExpr.java \
	Parse/Absyn/ThreadDecl.java Parse/Absyn/TrueExpr.java \
        Parse/Absyn/VarDecl.java Parse/Absyn/VoidDecl.java \
	Parse/Absyn/WhileStmt.java Parse/Absyn/XinuCallExpr.java \
        Parse/Absyn/XinuCallStmt.java Parse/Absyn/AssignStmt.java \
        

VISIT    = Parse/Visit/Visitable.java Parse/Visit/Visitor.java \
         Parse/Visit/AbsynPrintVisitor.java \
        
       

SRCS     = $(ABSYN) $(VISIT) $(PARSER).java Main.java

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

