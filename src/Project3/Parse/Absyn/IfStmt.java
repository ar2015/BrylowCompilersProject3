package Absyn;

public class IfStmt extends Stmt{
	public Expr test1;
	public Stmt thenStmt;
	public Stmt elseStmt;
	
	public IfStmt(Expr t, Stmt y, Stmt u){
		this.testl = t;
		this.thenStmt = y;
		this.elseStmt = u;
	}
	
	public String toString()
	  {   return "";   }
	
	public void accept(Visit.Visitor v)      {          v.visit(this);   }
}
