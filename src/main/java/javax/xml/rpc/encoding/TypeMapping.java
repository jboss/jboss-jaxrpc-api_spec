package javax.xml.rpc.encoding;

import javax.xml.namespace.QName;

/**
 * This is the base interface for the representation of a type mapping. A
 * TypeMapping implementation class may support one or more encoding styles.
 * 
 * For its supported encoding styles, a TypeMapping instance maintains a set of
 * tuples of the type {Java Class, SerializerFactory, DeserializerFactory, XML type-QName}.
 * 
 * @author Scott.Stark@jboss.org
 */
public interface TypeMapping
{

   /**
    * Gets the DeserializerFactory registered for the specified pair of Java type and XML data type.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @return Registered DeserializerFactory or null if there is no registered factory
    */
   public DeserializerFactory getDeserializer(Class javaType, QName xmlType);

   /**
    * Gets the SerializerFactory registered for the specified pair of Java type and XML data type.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @return Registered SerializerFactory or null if there is no registered factory
    */
   public SerializerFactory getSerializer(Class javaType, QName xmlType);

   /**
    * Returns the encodingStyle URIs (as String[]) supported by this TypeMapping instance.
    * A TypeMapping that contains only encoding style independent serializers and deserializers
    * returns null from this method.
    *
    * @return Array of encodingStyle URIs for the supported encoding styles
    */
   public String[] getSupportedEncodings();

   /**
    * Sets the encodingStyle URIs supported by this TypeMapping instance. A TypeMapping that contains only encoding
    * independent serializers and deserializers requires null as the parameter for this method.
    *
    * @param encodingStyleURIs Array of encodingStyle URIs for the supported encoding styles
    */
   public void setSupportedEncodings(String[] encodingStyleURIs);

   /**
    * Checks whether or not type mapping between specified XML type and Java type is registered.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @return boolean; true if type mapping between the specified XML type and Java type is registered; otherwise false
    */
   public boolean isRegistered(Class javaType, QName xmlType);

   /**
    * Registers SerializerFactory and DeserializerFactory for a specific type mapping between an XML type and Java type.
    * This method replaces any existing registered SerializerFactory DeserializerFactory instances.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @param sf SerializerFactory
    * @param dsf DeserializerFactory
    * @throws javax.xml.rpc.JAXRPCException If any error during the registration
    */
   public void register(Class javaType, QName xmlType, SerializerFactory sf, DeserializerFactory dsf);

   /**
    * Removes the DeserializerFactory registered for the specified pair of Java type and XML data type.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @throws javax.xml.rpc.JAXRPCException If there is error in removing the registered DeserializerFactory
    */
   public void removeDeserializer(Class javaType, QName xmlType);

   /**
    * Removes the SerializerFactory registered for the specified pair of Java type and XML data type.
    * @param javaType Class of the Java type
    * @param xmlType QName of the XML type
    * @throws javax.xml.rpc.JAXRPCException If there is error in removing the registered SerializerFactory
    */
   public void removeSerializer(Class javaType, QName xmlType);
}
