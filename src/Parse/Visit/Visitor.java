
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
  public void visit(Absyn.AddExpr p);

}// Visitor
