package javax.xml.rpc;

/** A type-safe enumeration for parameter passing modes.
 *  
 * @author Scott.Stark@jboss.org
 */
public class ParameterMode
{
   private String mode;

   public static final ParameterMode IN = new ParameterMode("IN");
   public static final ParameterMode OUT = new ParameterMode("OUT");
   public static final ParameterMode INOUT = new ParameterMode("INOUT");

   private ParameterMode(String mode)
   {
      this.mode = mode;
   }

   public String toString()
   {
      return mode;
   }
}
