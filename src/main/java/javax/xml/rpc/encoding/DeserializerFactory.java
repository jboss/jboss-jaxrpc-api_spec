package javax.xml.rpc.encoding;

import java.io.Serializable;
import java.util.Iterator;

/** A factory of deserializers. A DeserializerFactory is registered with a
 * TypeMapping instance as part of the TypeMappingRegistry.
 *
 * @see Deserializer
 * @see TypeMapping 
 * @see TypeMappingRegistry
 * 
 * @author Scott.Stark@jboss.org
 */
public interface DeserializerFactory extends Serializable
{
   /**
    * Returns a Deserializer for the specified XML processing mechanism type.
    * @param mechanismType XML processing mechanism type [TBD: definition of valid constants]
    * @return a Deserializer
    * @throws javax.xml.rpc.JAXRPCException If DeserializerFactory does not support the specified XML processing mechanism
    */
   public Deserializer getDeserializerAs(String mechanismType);

   /** Returns a list of all XML processing mechanism types supported by this DeserializerFactory.
    *
    * @return List of unique identifiers for the supported XML processing mechanism types
    */
   public Iterator getSupportedMechanismTypes();
}
