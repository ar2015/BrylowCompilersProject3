package Absyn;

import java.util.AbstractList;

public class Program implements Visit.Visitable{
	public AbstractList<ClassDecl> classes;
	public AbstractList<ThreadDecl> threads;
	
	public Program(AbstractList<ClassDecl> a2, AbstractList<ThreadDecl> a3){

		classes = a2;
		threads = a3;
	}
	
	public String toString(){
		if(classes != null){
			return classes.toString();
		}else{
			return null;
		}
	}
	
	public void accept(Visit.Visitor v){v.visit(this);}
}
