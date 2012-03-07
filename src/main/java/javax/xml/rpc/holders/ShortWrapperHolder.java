package javax.xml.rpc.holders;

/** A holder for Shorts.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class ShortWrapperHolder implements Holder
{
   public Short value;

   public ShortWrapperHolder()
   {

   }

   public ShortWrapperHolder(Short value)
   {
      this.value = value;
   }
}
