package javax.xml.rpc.holders;

/** A holder for longs.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class LongHolder implements Holder
{
   public long value;

   public LongHolder()
   {

   }

   public LongHolder(long value)
   {
      this.value = value;
   }
}
