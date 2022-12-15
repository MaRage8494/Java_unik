import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task_1("Gadzhiev",12,9,2021,18,22,17);
        System.out.println();
        Task_2(12,9,121,18,22,17);
        System.out.println();
        Task_3();
        System.out.println();
        Task_4();
        System.out.println();
        Task_5();
    }
    public static void Task_1(String surname, int day, int month, int year, int hour, int minutes, int seconds){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR,hour);
        calendar.set(Calendar.MINUTE,minutes);
        calendar.set(Calendar.SECOND,seconds);
        System.out.println("Surname worker: " + surname + "\n" + "Start time: " + sdf.format(calendar.getTime()));
        calendar.set(Calendar.YEAR,2021);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.HOUR,19);
        calendar.set(Calendar.MINUTE,32);
        calendar.set(Calendar.SECOND,20);
        System.out.println("Final time: " + sdf.format(calendar.getTime()));
    }
    public static void Task_2( int day, int month, int year, int hour, int minutes, int seconds){
        Date date = new Date();
        date.setYear(121);
        date.setHours(hour);
        date.setDate(day);
        date.setMonth(month);
        date.setMinutes(minutes);
        date.setSeconds(seconds);
        Date currentDate = new Date();
        int a = currentDate.compareTo(date);
        System.out.println("Input date: " + date);
        System.out.println("Current date: " + currentDate);
        if (a == -1){
            System.out.println("Current date lower than input");
        }
        else if (a == 1){
            System.out.println("Current date higher than input");
        }
        else if (a == 0){
            System.out.println("Current date equal input");
        }
    }
    public static void Task_3(){
        Student stud1 = new Student(12,9,2003,18,22,17);
        Student stud2 = new Student(12,9,2003,18);
        Student stud3 = new Student(12,9,2003);
    }
    public static void Task_4(){
        System.out.print("Year:");
        Scanner year = new Scanner(System.in);
        int year_1 = year.nextInt();
        System.out.print("Month:");
        Scanner month = new Scanner(System.in);
        int month_1 = month.nextInt();
        System.out.print("Day:");
        Scanner day = new Scanner(System.in);
        int day_1 = day.nextInt();
        System.out.print("Hour:");
        Scanner hour = new Scanner(System.in);
        int hour_1 = hour.nextInt();
        System.out.print("Minutes:");
        Scanner minute = new Scanner(System.in);
        int minute_1 = minute.nextInt();
        Date date = new Date();
        date.setYear(year_1 - 1900);
        date.setHours(hour_1);
        date.setDate(day_1);
        date.setMonth(month_1 - 1);
        date.setMinutes(minute_1);
        System.out.println();
        System.out.println("Date:");
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year_1);
        calendar.set(Calendar.MONTH, month_1-1);
        calendar.set(Calendar.DAY_OF_MONTH, day_1);
        calendar.set(Calendar.HOUR,hour_1);
        calendar.set(Calendar.MINUTE,minute_1);
        System.out.println("Calendar:");
        System.out.println(sdf.format(calendar.getTime()));
    }
    public static void Task_5(){
        LinkedList<Integer> l_list = new LinkedList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Insert time:");
        Time count = new Time();
        long result = count.getTimeMsOfInsert(l_list);
        System.out.println("LinkedList Time: " + result + "ms");
        long result2 = count.getTimeMsOfInsert(list);
        System.out.println("ArrayList Time: " + result2 + "ms \n");
        System.out.println("Get time:");
        long result3 = count.getTimeMsOfGet(l_list);
        System.out.println("LinkedList Time: " + result3 + "ms");
        long result4 = count.getTimeMsOfGet(list);
        System.out.println("ArrayList Time: " + result4 + "ms \n");
        System.out.println("Delete time:");
        long result5 = count.getTimeMsOfDelete(l_list);
        System.out.println("LinkedList Time: " + result5 + "ms");
        long result6 = count.getTimeMsOfDelete(list);
        System.out.println("ArrayList Time: " + result6 + "ms \n");
    }
}