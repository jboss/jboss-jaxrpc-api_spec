package javax.xml.rpc.holders;

/** A holder for Bytes.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class ByteWrapperHolder implements Holder
{
   public Byte value;

   public ByteWrapperHolder()
   {

   }

   public ByteWrapperHolder(Byte value)
   {
      this.value = value;
   }
}
