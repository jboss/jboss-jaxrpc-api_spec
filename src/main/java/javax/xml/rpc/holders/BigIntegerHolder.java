package javax.xml.rpc.holders;

import java.math.BigInteger;

/** A holder for BigIntegers.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class BigIntegerHolder implements Holder
{
   public BigInteger value;

   public BigIntegerHolder()
   {

   }

   public BigIntegerHolder(BigInteger value)
   {
      this.value = value;
   }
}
