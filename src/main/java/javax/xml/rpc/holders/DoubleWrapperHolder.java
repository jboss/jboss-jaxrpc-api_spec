package javax.xml.rpc.holders;

/** A holder for Doubles.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class DoubleWrapperHolder implements Holder
{
   public Double value;

   public DoubleWrapperHolder()
   {

   }

   public DoubleWrapperHolder(Double value)
   {
      this.value = value;
   }
}
