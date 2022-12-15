import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 task
//        Student[] idNumbers = new Student[10];
//        for (int i = 0; i<idNumbers.length; i++){
//            idNumbers[i] = new Student((int)(Math.random()*100));
//        }
//        System.out.println("Non sorted array:");
//        for (int i = 0; i<idNumbers.length; i++){
//            System.out.print(" "+idNumbers[i].getId());
//        }
//        System.out.println();
//        System.out.println("Sorted array:");
//        for (int i = 0; i < idNumbers.length; i++) {
//            int value = idNumbers[i].getId();
//            int t = i - 1;
//            for (; t >= 0; t--) {
//                if (value < idNumbers[t].getId()) {
//                    idNumbers[t + 1].setId(idNumbers[t].getId());
//                } else {
//                    break;
//                }
//            }
//            idNumbers[t + 1].setId(value);
//        }
//        for (int i = 0; i<idNumbers.length; i++){
//            System.out.print(" "+idNumbers[i].getId());
//        }
        //2 task
//        Student[] students = new Student[5];
//        String[] names = {"Marat", "Ilya", "Nikita", "Egor", "Stas"};
//        for(int i = 0; i< students.length;i++){
//            students[i] = new Student();
//        }
//        for(int i = 0; i< students.length;i++){
//            students[i].setName(names[i]);
//            students[i].setGPA((float)(Math.random()*4+1));
//        }
//        new SortingStudentsByGPA(students);
        //3 task
        Student[] students_1 = new Student[5];
        Student[] students_2 = new Student[5];
        for (int i = 0; i<students_1.length; i++){
            students_1[i] = new Student((int)(Math.random()*100), (float)(Math.random()*1000));
            students_2[i] = new Student((int)(Math.random()*100), (float)(Math.random()*1000));
        }
        System.out.println("Before:");
        System.out.println(Arrays.toString(students_1));
        System.out.println(Arrays.toString(students_2));
        MergeSort sort = new MergeSort();
        students_1 = sort.mergeSort(students_1);
        students_2 = sort.mergeSort(students_2);
        Student[] students = new Student[10];
        students = sort.mergeArrays(students_1,students_2);
        System.out.println("After:");
        System.out.println(Arrays.toString(sort.mergeArrays(students_1,students_2)));
    }
}