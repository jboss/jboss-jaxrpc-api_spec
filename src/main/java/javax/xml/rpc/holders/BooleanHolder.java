package javax.xml.rpc.holders;

/** A holder for booleans.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class BooleanHolder implements Holder
{
   public boolean value;

   public BooleanHolder()
   {

   }

   public BooleanHolder(boolean value)
   {
      this.value = value;
   }
}
