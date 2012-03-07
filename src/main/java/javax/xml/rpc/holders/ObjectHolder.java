package javax.xml.rpc.holders;

/** A holder for Objects.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class ObjectHolder implements Holder
{
   public Object value;

   public ObjectHolder()
   {

   }

   public ObjectHolder(Object value)
   {
      this.value = value;
   }
}
