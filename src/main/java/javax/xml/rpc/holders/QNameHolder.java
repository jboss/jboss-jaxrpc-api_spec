package javax.xml.rpc.holders;

import javax.xml.namespace.QName;

/** A holder for QNames.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class QNameHolder implements Holder
{
   public QName value;

   public QNameHolder()
   {

   }

   public QNameHolder(QName value)
   {
      this.value = value;
   }
}
