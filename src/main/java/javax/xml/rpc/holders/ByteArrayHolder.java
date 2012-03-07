package javax.xml.rpc.holders;

/** A holder for byte[]s.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class ByteArrayHolder implements Holder
{
   public byte[] value;

   public ByteArrayHolder()
   {

   }

   public ByteArrayHolder(byte[] value)
   {
      this.value = value;
   }
}
