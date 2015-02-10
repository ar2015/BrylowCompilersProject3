package Absyn;

public class Goal
{
  public ClassDecl cd;
  public Goal(ClassDecl cd) {   this.cd = cd;   }

  public String toString()
  {
    if (null != cd) return cd.toString();
    else           return null;
  }

}
