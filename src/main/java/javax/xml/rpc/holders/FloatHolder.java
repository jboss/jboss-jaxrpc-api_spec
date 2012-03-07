package javax.xml.rpc.holders;

/** A holder for floats.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class FloatHolder implements Holder
{
   public float value;

   public FloatHolder()
   {

   }

   public FloatHolder(float value)
   {
      this.value = value;
   }
}
