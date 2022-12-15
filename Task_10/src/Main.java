import java.util.Arrays;
import static java.lang.System.arraycopy;
class Student implements Comparable <Student>{
    private Integer iDNumber;
    private Double GPAScore;

    public Student(int iDNumber){
        this.iDNumber = iDNumber;
        this.GPAScore = 0.0;
    }

    public Student(double GPAScore){
        this.GPAScore = GPAScore;
        this.iDNumber = 1;
    }

    public Student(int iDNumber, double GPAScore){
        this.GPAScore = GPAScore;
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student second){
        return (int)(Math.ceil(this.GPAScore) - Math.ceil(second.GPAScore));
    }

    public int compareToNumbers(Student second){
        return this.iDNumber - second.iDNumber;
    }

    public String toString(){
        return "Student #" + iDNumber + ", GPA score: " + Math.ceil(GPAScore);
    }

}

class testClassQuickSort {

    Student[] StudentsList;

    public void fillStudentsList(int length){
        StudentsList = new Student[length];

        for(int i = 0; i < length; i ++)
            StudentsList[i] = new Student((double) (Math.random()*1000));
    }

    public void quickSort(int low, int high){
        if (StudentsList.length == 0)
            return;

        if (low >= high)
            return;

        Student basePoint = StudentsList[(int)(low + (high - low) / 2)];

        int i = low, j = high;

        while (i <= j) {
            while (StudentsList[i].compareTo(basePoint) < 0)
                i++;

            while (StudentsList[j].compareTo(basePoint) > 0)
                j--;

            if (i <= j) {//меняем местами
                Student temp = StudentsList[i];
                StudentsList[i] = StudentsList[j];
                StudentsList[j] = temp;
                i++;
                j--;
            }

        }

        if (low < j)
            quickSort(low, j);

        if (high > i)
            quickSort(i, high);
    }

}

class testClassMergeSort {

    Student[] StudentsListFirst;
    Student[] StudentsListSecond;


    private void fillStudentLists(int length_first, int length_second){
        StudentsListFirst = new Student[length_first];
        StudentsListSecond = new Student[length_second];

        for(int i = 0 ; i < length_first; i++)
            StudentsListFirst[i] = new Student((int)(Math.random()*length_first+1),(double) (Math.random()*1000));

        for(int i = 0 ; i < length_second; i++)
            StudentsListSecond[i] = new Student((int)(Math.random()*length_first+1),(double) (Math.random()*1000));
    }

    private Student[] mergeSort(Student[] StudentsList){
        if (StudentsList == null )
            return null;

        if(StudentsList.length <2)
            return StudentsList;

        Student [] StudentsListLeft = new Student[StudentsList.length / 2];
        arraycopy(StudentsList, 0, StudentsListLeft, 0, StudentsList.length / 2);

        Student [] StudentsListRight = new Student[StudentsList.length - StudentsList.length / 2];
        arraycopy(StudentsList, StudentsList.length / 2, StudentsListRight, 0, StudentsList.length - StudentsList.length / 2);

        StudentsListLeft = mergeSort(StudentsListLeft);
        StudentsListRight = mergeSort(StudentsListRight);

        return mergeArrays(StudentsListLeft, StudentsListRight);

    }

    private Student[] mergeArrays(Student[] StudentsListLeft, Student[] StudentsListRight) {

        Student[] StudentsListFinal = new Student[StudentsListLeft.length + StudentsListRight.length];

        int posLeft = 0, posRight = 0, curPos = 0;

        while(posLeft < StudentsListLeft.length && posRight < StudentsListRight.length)
            StudentsListFinal[curPos++] = StudentsListLeft[posLeft].compareTo(StudentsListRight[posRight]) < 0 ?
                    StudentsListLeft[posLeft++] : StudentsListRight[posRight++];

        if(posLeft< StudentsListLeft.length)
            arraycopy(StudentsListLeft, posLeft, StudentsListFinal, curPos, StudentsListLeft.length - posLeft);
        else if(posRight< StudentsListRight.length)
            arraycopy(StudentsListRight, posRight, StudentsListFinal, curPos, StudentsListRight.length - posRight);

        return StudentsListFinal;
    }

    public void execute(int length_first, int length_second){
        fillStudentLists(length_first,length_second);
        System.out.println("Original array:");
        System.out.println(Arrays.toString(StudentsListFirst));
        System.out.println(Arrays.toString(StudentsListSecond));
        StudentsListFirst = mergeSort(StudentsListFirst);
        StudentsListSecond = mergeSort(StudentsListSecond);
        System.out.println("Sorted and merged array: " + Arrays.toString(mergeArrays(StudentsListFirst,StudentsListSecond)));
    }

}

class testClassInsertionSort {

    Student[] StudentsList;

    public void fillStudentsList(int length){
        StudentsList = new Student[length];
        for(int i = 0 ; i < length; i++)
            StudentsList[i] = new Student((int)(Math.random()*length+1)); //,(double) (Math.random()*1000));
    }

    public void insertionSortStudentsList(){

        for (int left = 1; left < StudentsList.length; left++) {
            Student value = StudentsList[left];
            int i = left -1;
            while (i>=0 && StudentsList[i].compareToNumbers(value) >= 0) {
                StudentsList[i + 1] = StudentsList[i];
                i -=1;
            }
            StudentsList[i + 1] = value;
        }

    }

}


public class Main {

    public static void main(String[] args){
        //вставками
        System.out.println("------------");
        testClassInsertionSort testClass = new testClassInsertionSort();
        testClass.fillStudentsList(10);
        System.out.println("Original array: " + Arrays.toString(testClass.StudentsList));
        testClass.insertionSortStudentsList();
        System.out.println("Sorted array: " + Arrays.toString(testClass.StudentsList));

        //быстрая
        System.out.println("\n\n------------");
        testClassQuickSort testClassQuickSort = new testClassQuickSort();
        testClassQuickSort.fillStudentsList(10);
        System.out.println("Original array: " + Arrays.toString(testClassQuickSort.StudentsList));
        testClassQuickSort.quickSort(0,9);
        System.out.println("Sorted array: " + Arrays.toString(testClassQuickSort.StudentsList));

        //слиянием
        System.out.println("\n\n------------");
        testClassMergeSort testClassMergeSort = new testClassMergeSort();
        testClassMergeSort.execute(10,10);
    }

}