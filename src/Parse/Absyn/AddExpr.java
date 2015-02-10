package Absyn;

public class AddExpr extends BinOpExpr {
	Expr e1, e2;
	public AddExpr(Expr e1, Expr e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	 public String toString()
	  {   return this.e1 + " + " + this.e2;   }
	
	 public void accept(Visit.Visitor v)      {          v.visit(this);   }
}
