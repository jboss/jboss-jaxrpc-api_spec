package javax.xml.rpc.handler.soap;

import javax.xml.rpc.handler.MessageContext;
import javax.xml.soap.SOAPMessage;

/** This interface provides access to the SOAP message for either RPC request
 * or response. The javax.xml.soap.SOAPMessage specifies the standard Java API
 * for the representation of a SOAP 1.1 message with attachments.
 * 
 * @author Scott.Stark@jboss.org
 * @author Rahul Sharma (javadoc)
 */
public interface SOAPMessageContext extends MessageContext
{
   public SOAPMessage getMessage();

   public void setMessage(SOAPMessage message);

   public String[] getRoles();
}
