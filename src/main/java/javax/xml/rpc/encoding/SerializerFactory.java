package javax.xml.rpc.encoding;

import java.io.Serializable;
import java.util.Iterator;

/**
 * This is a factory of the serializers. A SerializerFactory is registered
 * with a TypeMapping object as part of the TypeMappingRegistry.
 * 
 * @see Serializer
 * @see TypeMapping 
 * @see TypeMappingRegistry
 * 
 * @author Scott.Stark@jboss.org
 */
public interface SerializerFactory extends Serializable
{
   /** Returns a Serializer for the specified XML processing mechanism type.
    *
    * @param mechanismType XML processing mechanism type [TBD: definition of valid constants]
    * @return A Serializer
    * @throws javax.xml.rpc.JAXRPCException If SerializerFactory does not support the specified XML processing mechanism
    * @throws IllegalArgumentException If an invalid mechanism type is specified.
    */
   public Serializer getSerializerAs(String mechanismType);

   /** Returns a list of all XML processing mechanism types supported by this SerializerFactory.
    * @return List of unique identifiers for the supported XML processing mechanism types
    */
   public Iterator getSupportedMechanismTypes();
}
