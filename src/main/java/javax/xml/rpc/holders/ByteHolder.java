package javax.xml.rpc.holders;

/** A holder for bytes.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class ByteHolder implements Holder
{
   public byte value;

   public ByteHolder()
   {

   }

   public ByteHolder(byte value)
   {
      this.value = value;
   }
}
