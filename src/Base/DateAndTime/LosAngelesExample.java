package Base.DateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int amPm = now.get(Calendar.AM_PM);
        String strAmpm = null;
        if(amPm == Calendar.AM){
            strAmpm = "오전";
        } else {
            strAmpm = "오후";
        }
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        
        System.out.println(strAmpm + " ");
        System.out.print(hour + "시");
        System.out.print(minute + "분");
        System.out.print(second + "초");
    }
}
