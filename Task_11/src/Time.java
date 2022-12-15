import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Time {
    long start;
    public long getTimeMsOfInsert(List list){
        Date currentTime = new Date();
        zapolnyalka(list);
        Date finishTime = new Date();
        long result = finishTime.getTime() - currentTime.getTime();
        return result;
    }
    public long getTimeMsOfGet(List list){
        Date currentTime = new Date();
        getalka(list);
        Date finishTime = new Date();
        long result = finishTime.getTime()-currentTime.getTime();
        return result;
    }
    public long getTimeMsOfDelete(List list){
        Date currentTime = new Date();
        deletalka(list);
        Date finishTime = new Date();
        long result = finishTime.getTime()-currentTime.getTime();
        return result;
    }
    public static void deletalka(List list){
        for (int i = 0; i<10000; i++){
            list.remove(new Object());
        }
    }
    public static void zapolnyalka(List list){
        for (int i = 0; i<10000; i++){
            list.add(0, new Object());
        }
    }
    public static void getalka (List list){
        for (int i = 0; i<10000; i++){
            list.get(i);
        }
    }
}
