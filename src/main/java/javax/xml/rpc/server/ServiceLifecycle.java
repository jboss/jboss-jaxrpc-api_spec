package javax.xml.rpc.server;

import javax.xml.rpc.ServiceException;

/** This interface defines a lifecycle interface for a JAX-RPC service endpoint.
 * If the service endpoint class implements the ServiceLifeycle interface, the
 * servlet container based JAX-RPC runtime system is required to manage the
 * lifecycle of the corresponding service endpoint objects.
 * 
 * @author Scott.Stark@jboss.org
 * @author Rahul Sharma (javadoc)
 */
public interface ServiceLifecycle
{
   /**
    * Used for initialization of a service endpoint. After a service endpoint instance (an instance of a service endpoint class)
    * is instantiated, the JAX-RPC runtime system invokes the init method.
    * The service endpoint class uses the init method to initialize its configuration and setup access to any external resources.
    * The context parameter in the init method enables the endpoint instance to access the endpoint context provided by
    * the underlying JAX-RPC runtime system.
    *
    * The init method implementation should typecast the context parameter to an appropriate Java type.
    * For service endpoints deployed on a servlet container based JAX-RPC runtime system, the context parameter is
    * of the Java type javax.xml.rpc.server.ServletEndpointContext. The ServletEndpointContext provides an endpoint
    * context maintained by the underlying servlet container based JAX-RPC runtime system
    *
    * @param context Endpoint context for a JAX-RPC service endpoint
    * @throws ServiceException If any error in initialization of the service endpoint; or if any illegal context has been provided in the init method
    */
   public void init(Object context) throws ServiceException;

   /**
    *  JAX-RPC runtime system ends the lifecycle of a service endpoint instance by invoking the destroy method.
    * The service endpoint releases its resourcesin the implementation of the destroy method. 
    */
   public void destroy();
}
