import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task.Array(10);

    }
    public class Task{
        public static void Array (int n){
            Random random = new Random();
            int[] array = new int[n];
            for (int i = 0; i < n; i++){
                array[i] = random.nextInt();
                System.out.print(" " + array[i]);
            }
            System.out.println("\nSorted:");
            Arrays.sort(array);
            for (int i = 0; i < n; i++){
                System.out.print(" " + array[i]);
            }
        }
    }
}