import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    int day, month, year, hour, minutes, seconds;
    public Student (int day, int month, int year, int hour, int minutes, int seconds){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR,hour);
        calendar.set(Calendar.MINUTE,minutes);
        calendar.set(Calendar.SECOND,seconds);
        System.out.println("Birthday(full): " + sdf.format(calendar.getTime()));
    }
    public Student (int day, int month, int year, int hour){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'at' HH");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR,hour);
        System.out.println("Birthday(semi-full): " + sdf.format(calendar.getTime()) + " AM");
    }
    public Student (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("Birthday(short): " + sdf.format(calendar.getTime()));
    }

}
