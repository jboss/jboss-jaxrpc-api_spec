package javax.xml.rpc.holders;

import java.math.BigDecimal;

/** A holder for BigDecimals.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class BigDecimalHolder implements Holder
{
   public BigDecimal value;

   public BigDecimalHolder()
   {

   }

   public BigDecimalHolder(BigDecimal value)
   {
      this.value = value;
   }
}
