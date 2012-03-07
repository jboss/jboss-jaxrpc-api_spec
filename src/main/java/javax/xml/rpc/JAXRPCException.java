package javax.xml.rpc;

/**
 * @author Scott.Stark@jboss.org
 */
public class JAXRPCException extends RuntimeException
{
   private static final long serialVersionUID = 5213579554532711730L;

   public JAXRPCException()
   {
   }

   public JAXRPCException(String message)
   {
      super(message);
   }

   public JAXRPCException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public JAXRPCException(Throwable cause)
   {
      super(cause);
   }

   public Throwable getLinkedCause()
   {
      return super.getCause();
   }
}
