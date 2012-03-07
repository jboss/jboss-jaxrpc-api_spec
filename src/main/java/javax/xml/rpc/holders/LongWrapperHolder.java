package javax.xml.rpc.holders;

/** A holder for Longs.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class LongWrapperHolder implements Holder
{
   public Long value;

   public LongWrapperHolder()
   {

   }

   public LongWrapperHolder(Long value)
   {
      this.value = value;
   }
}
