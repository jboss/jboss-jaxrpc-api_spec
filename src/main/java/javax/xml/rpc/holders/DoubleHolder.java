package javax.xml.rpc.holders;

/** A holder for doubles.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class DoubleHolder implements Holder
{
   public double value;

   public DoubleHolder()
   {

   }

   public DoubleHolder(double value)
   {
      this.value = value;
   }
}
