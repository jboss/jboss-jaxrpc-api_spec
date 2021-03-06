package javax.xml.rpc.encoding;

import java.io.Serializable;

/** A base interface for deserializers. A Deserializer converts an XML
 * representation to a Java object using a specific XML processing mechanism
 * and based on the specified type mapping and encoding style.
 * 
 * @author Scott.Stark@jboss.org
 */
public interface Deserializer extends Serializable
{
   public String getMechanismType();
}
