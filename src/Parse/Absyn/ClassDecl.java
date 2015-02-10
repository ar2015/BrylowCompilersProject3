package Absyn;

public class ClassDecl {
	public Token name = null;
	public AbstractList<Absyn.FieldExpr> fes;
	public AbstractList<Absyn.MethodDecl> mds;
	public AbstractList<Absyn.VoidDecl> vds;
	
	public ClassDecl( AbstractList<Absyn.FieldExpr> fes1,
			 AbstractList<Absyn.MethodDecl> mds1,
			 AbstractList<Absyn.VoidDecl> vds1)
	{
		

	}
	
	public String toString(){
		;
	}
}
