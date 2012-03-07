package javax.xml.rpc.holders;

/** A holder for Integers.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class IntegerWrapperHolder implements Holder
{
   public Integer value;

   public IntegerWrapperHolder()
   {

   }

   public IntegerWrapperHolder(Integer value)
   {
      this.value = value;
   }
}
