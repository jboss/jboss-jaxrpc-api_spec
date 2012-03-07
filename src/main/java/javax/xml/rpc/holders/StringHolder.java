package javax.xml.rpc.holders;

/** A holder for Strings.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class StringHolder implements Holder
{
   public String value;

   public StringHolder()
   {

   }

   public StringHolder(String value)
   {
      this.value = value;
   }
}
