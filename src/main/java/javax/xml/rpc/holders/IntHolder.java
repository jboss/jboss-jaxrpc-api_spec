package javax.xml.rpc.holders;

/** A holder for ints.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class IntHolder implements Holder
{
   public int value;

   public IntHolder()
   {

   }

   public IntHolder(int value)
   {
      this.value = value;
   }
}
