package javax.xml.rpc.holders;

import java.util.Calendar;

/** A holder for Calendars.
 * 
 * @author Scott.Stark@jboss.org
 */
public final class CalendarHolder implements Holder
{
   public Calendar value;

   public CalendarHolder()
   {

   }

   public CalendarHolder(Calendar value)
   {
      this.value = value;
   }
}
