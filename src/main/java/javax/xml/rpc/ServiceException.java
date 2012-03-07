package javax.xml.rpc;

/**
 * @author Scott.Stark@jboss.org
 */
public class ServiceException extends Exception
{
   private static final long serialVersionUID = -6582148924441189775L;

   public ServiceException()
   {
   }

   public ServiceException(String message)
   {
      super(message);
   }

   public ServiceException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public ServiceException(Throwable cause)
   {
      super(cause);
   }

   public Throwable getLinkedCause()
   {
      return super.getCause();
   }
}
