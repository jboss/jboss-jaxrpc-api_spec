package javax.xml.rpc.holders;

/** A holder for Booleans.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class BooleanWrapperHolder implements Holder
{
   public Boolean value;

   public BooleanWrapperHolder()
   {

   }

   public BooleanWrapperHolder(Boolean value)
   {
      this.value = value;
   }
}
