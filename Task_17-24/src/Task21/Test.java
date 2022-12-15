package Task21;


import java.util.Collections;

public class Test {


    public static void main(String[] args) {
        ArrayStorage<Integer> storage = new ArrayStorage<>();
        Integer[] ar = {8,3,21,12,3};
        storage.setArray(ar);
        for (int i = 0; i < storage.length; i++) {
            System.out.print(storage.get(i) + " ");
        }
        System.out.println( "\n" + storage.get(3));
    }
}
