package javax.xml.rpc.holders;

/** A holder for Floats.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class FloatWrapperHolder implements Holder
{
   public Float value;

   public FloatWrapperHolder()
   {

   }

   public FloatWrapperHolder(Float value)
   {
      this.value = value;
   }
}
