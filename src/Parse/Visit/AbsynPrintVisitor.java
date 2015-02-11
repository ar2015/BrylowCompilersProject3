package Visit;

/**
 * AbsynPrintVisitor.java
 *
 * Given an AST of the program, prints and abstract syntax tree dump of
 *  the tree, suitable for completely rebuilding the tree in the next stage
 *  of the example.
 *
 * Created: Thu Sep 23 14:18:50 2004
 *
 * @author <a href="mailto:brylow@elsinore.cs.purdue.edu">Dennis Brylow</a>
 * @version 1.0
 */

public class AbsynPrintVisitor implements Visitor
{
  private java.io.PrintStream out;
  private int indent = 0;

  public AbsynPrintVisitor()
  {  this(System.out);  }

  public AbsynPrintVisitor(java.io.PrintStream out)
  {  this.out = out;  }

  private void printIndent()
  {  for (int i = 0; i < indent; i++)  out.print(" ");  }

  public void visit(Absyn.Program g)
  {
    out.println("Program(");
    indent += 2;    printIndent();
    out.println("AbstractList(");
    indent += 2;    printIndent();
    //TODO handle Lists
    //g.classes.accept(this);
    for(Absyn.ClassDecl c : g.classes){
    	c.accept(this);
    }

    indent -= 2;
    out.println(")");
    indent -= 2;    printIndent();
    out.println(")");
  }

  public void visit(Absyn.Expr e)    {  }
 

//  private void printBinOp(Absyn.Exp left, Absyn.Exp right)
//  {
//    out.println("(");
//    indent += 2;    printIndent();
//    out.println("left(");
//    indent += 2;    printIndent();
//
//    left.accept(this);
//
//    out.println("),");
//    indent -= 2;    printIndent();
//    out.println("right(");
//    indent += 2;    printIndent();
//
//    right.accept(this);
//
//    out.print("))");
//    indent -= 4;
//  }

  public void visit(Absyn.AddExpr e)
  {
    out.print("AddExpr(");
    indent += 2;    printIndent();
    
    e.e1.accept(this);
    e.e2.accept(this);
    
    indent -= 2;    printIndent();
    out.print(")");
  }
  
  public void visit(Absyn.SubExpr e)
  {
    out.print("SubExpr(");
    indent += 2;    printIndent();
    
    e.e1.accept(this);
    e.e2.accept(this);
    
    indent -= 2;    printIndent();
    out.print(")");
  }
  
  public void visit(Absyn.MulExpr e)
  {
    out.print("MulExpr(");
    indent += 2;    printIndent();
    
    e.e1.accept(this);
    e.e2.accept(this);
    
    indent -= 2;    printIndent();
    out.print(")");
  }
  
  public void visit(Absyn.DivExpr e)
  {
    out.print("DivExpr(");
    indent += 2;    printIndent();
    
    e.e1.accept(this);
    e.e2.accept(this);
    
    indent -= 2;    printIndent();
    out.print(")");
  }

  
  public void visit(Absyn.IntegerLiteral e)
  {
    out.print("IntegerLiteral(" + e.value + ")");
  }

  public void visit(Absyn.IdentifierExpr e)
  {
    out.print("IdentifierExpr(" + e.id + ")");
  }
  
 // public void visit(Absyn.Absyn e)    
  //{  
	  
  //}
  
  public void visit(Absyn.AndExpr e)
  {
	  out.print("AndExpr(");
	    indent += 2;    printIndent();
	    
	    e.e1.accept(this);
	    e.e2.accept(this);
	    
	    indent -= 2;    printIndent();
	    out.print(")");
  }
  
  public void visit(Absyn.ArrayExpr e)
  {
	  out.print("ArrayExpr(");
	    indent += 2;    printIndent();
	    
	    e.target.accept(this);
	    e.index.accept(this);
	    
	    indent -= 2;    printIndent();
	    out.print(")");
  }
  public void visit(Absyn.ArrayType e)
  {
    
  }
  public void visit(Absyn.AssignableExpr e)
  {
    
  }
  public void visit(Absyn.AssignStmt e)
  {
    
  }
  public void visit(Absyn.BinOpExpr e)
  {
    
  }
  public void visit(Absyn.BlockStmt e)
  {
    
  }
  public void visit(Absyn.BooleanType e)
  {
    
  }
  public void visit(Absyn.CallExpr e)
  {
    
  }
  public void visit(Absyn.ClassDecl e)
  {
    
  }
  
  public void visit(Absyn.EqualExpr e)
  {
    
  }
 
  public void visit(Absyn.FalseExpr e)
  {
    
  }
  public void visit(Absyn.FieldExpr e)
  {
    
  }
  public void visit(Absyn.Formal e)
  {
    
  }
  public void visit(Absyn.GreaterExpr e)
  {
    
  }
  public void visit(Absyn.IdentifierType e)
  {
    
  }
  public void visit(Absyn.IfStmt e)
  {
    
  }
  public void visit(Absyn.IntegerType e)
  {
    
  }
  public void visit(Absyn.LesserExpr e)
  {
    
  }
  public void visit(Absyn.MethodDecl e)
  {
    
  }
  public void visit(Absyn.NegExpr e)
  {
    
  }
  public void visit(Absyn.NewArrayExpr e)
  {
    
  }
  public void visit(Absyn.NewObjectExpr e)
  {
    
  }
  public void visit(Absyn.NotEqExpr e)
  {
    
  }
  public void visit(Absyn.NotExpr e)
  {
    
  }
  public void visit(Absyn.NullExpr e)
  {
    
  }
  public void visit(Absyn.OrExpr e)
  {
    
  }
  public void visit(Absyn.PrintVisitor e)
  {
    
  }
  public void visit(Absyn.Stmt e)
  {
    
  }
  public void visit(Absyn.StringLiteral e)
  {
    
  }
  public void visit(Absyn.ThisExpr e)
  {
    
  }
  public void visit(Absyn.ThreadDecl e)
  {
    
  }
  public void visit(Absyn.TrueExpr e)
  {
    
  }
  public void visit(Absyn.Type e)
  {
    
  }
  public void visit(Absyn.VarDecl e)
  {
    
  }
  public void visit(Absyn.VoidDecl e)
  {
    
  }
  public void visit(Absyn.WhileStmt e)
  {
    
  }
  public void visit(Absyn.XinuCallExpr e)
  {
    
  }
  public void visit(Absyn.XinuCallStmt e)
  {
    
  }
  

}// Visitor

    
