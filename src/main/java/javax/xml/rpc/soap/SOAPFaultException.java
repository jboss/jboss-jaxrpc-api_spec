package javax.xml.rpc.soap;

import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.Name;

/** The SOAPFaultException exception represents a SOAP fault.
 * 
 * The message part in the SOAP fault maps to the contents of faultdetail
 * element accessible through the getDetail method on the SOAPFaultException.
 * The method createDetail on the javax.xml.soap.SOAPFactory creates an instance
 * of the javax.xml.soap.Detail.
 * 
 * The faultstring provides a human-readable description of the SOAP fault. The
 * faultcode element provides an algorithmic mapping of the SOAP fault.
 *  
 * Refer to SOAP 1.1 and WSDL 1.1 specifications for more details of the SOAP
 * faults. 
 * 
 * @author Scott.Stark@jboss.org
 * @author Thomas.Diesler@jboss.org
 * @author Rahul Sharma (javadoc)
 */
public class SOAPFaultException extends RuntimeException
{
   private static final long serialVersionUID = -7224636940495025621L;

   // provide logging
   private static Logger log = Logger.getLogger(SOAPFaultException.class.getName());

   private QName faultCode;
   private String faultString;
   private String faultActor;
   private Detail faultDetail;

   public SOAPFaultException(QName faultCode, String faultString, String faultActor, Detail faultDetail)
   {
      super(faultString);

      Name detailName = faultDetail != null ? faultDetail.getElementName() : null;
      log.fine("new SOAPFaultException [code=" + faultCode + ",string=" + faultString + ",actor=" + faultActor + ",detail=" + detailName + "]");

      this.faultCode = faultCode;
      this.faultString = faultString;
      this.faultActor = faultActor;
      this.faultDetail = faultDetail;
   }

   public QName getFaultCode()
   {
      return faultCode;
   }

   public String getFaultString()
   {
      return faultString;
   }

   public String getFaultActor()
   {
      return faultActor;
   }

   public Detail getDetail()
   {
      return faultDetail;
   }
}
