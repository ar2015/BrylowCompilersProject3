
package Visit;

/**
 * Visitor.java
 *
 *
 * Created: Thu Sep 23 14:18:50 2004
 *
 * @author <a href="mailto:brylow@elsinore.cs.purdue.edu">Dennis Brylow</a>
 * @version 1.0
 */

public interface Visitor
{
 
  
  
  public void visit(Absyn.Absyn a);
  public void visit(Absyn.AddExpr e);
  public void visit(Absyn.AndExpr e);
  public void visit(Absyn.ArrayExpr e);
  public void visit(Absyn.ArrayType e);
  public void visit(Absyn.AssignableExpr e);
  public void visit(Absyn.AssignStmt e);
  public void visit(Absyn.BinOpExpr e);
  public void visit(Absyn.BlockStmt e);
  public void visit(Absyn.BooleanType e);
  public void visit(Absyn.CallExpr e);
  public void visit(Absyn.ClassDecl e);
  public void visit(Absyn.DivExpr e);
  public void visit(Absyn.EqualExpr e);
  public void visit(Absyn.Expr e);
  public void visit(Absyn.FalseExpr e);
  public void visit(Absyn.FieldExpr e);
  public void visit(Absyn.Formal e);
  public void visit(Absyn.GreaterExpr e);
  public void visit(Absyn.IdentifierExpr e);
  public void visit(Absyn.IdentifierType e);
  public void visit(Absyn.IfStmt e);
  public void visit(Absyn.IntegerLiteral e);
  public void visit(Absyn.IntegerType e);
  public void visit(Absyn.LesserExpr e);
  public void visit(Absyn.MethodDecl e);
  public void visit(Absyn.MulExpr e);
  public void visit(Absyn.NegExpr e);
  public void visit(Absyn.NewArrayExpr e);
  public void visit(Absyn.NewObjectExpr e);
  public void visit(Absyn.NotEqExpr e);
  
  public void visit(Absyn.NullExpr e);
  public void visit(Absyn.OrExpr e);
  public void visit(Absyn.PrintVisitor e);
  
  public void visit(Absyn.Program e);
  public void visit(Absyn.Stmt e);
  public void visit(Absyn.StringLiteral e);
  public void visit(Absyn.SubExpr e);
  public void visit(Absyn.ThisExpr e);
  public void visit(Absyn.ThreadDecl e);
  public void visit(Absyn.TrueExpr e);
  public void visit(Absyn.Type e);
  public void visit(Absyn.VarDecl e);
  public void visit(Absyn.VoidDecl e);
  public void visit(Absyn.WhileStmt e);
  public void visit(Absyn.XinuCallStmt e);
  public void visit(Absyn.XinuCallExpr e);
 

}// Visitor
