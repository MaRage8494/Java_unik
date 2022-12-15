import java.lang.reflect.Array;
import java.util.Arrays;
import static java.lang.System.arraycopy;

public class MergeSort {

    public Student[] mergeSort(Student[] students){
        if (students == null ){
            return null;
        }

        if(students.length <2){
            return students;
        }

        Student [] StudentsListLeft = new Student[students.length / 2];
        arraycopy(students, 0, StudentsListLeft, 0, students.length / 2);

        Student [] StudentsListRight = new Student[students.length - students.length / 2];
        arraycopy(students, students.length / 2, StudentsListRight, 0, students.length - students.length / 2);

        StudentsListLeft = mergeSort(StudentsListLeft);
        StudentsListRight = mergeSort(StudentsListRight);

        return mergeArrays(StudentsListLeft, StudentsListRight);

    }

    public Student[] mergeArrays(Student[] StudentsListLeft, Student[] StudentsListRight) {

        Student[] StudentsListFinal = new Student[StudentsListLeft.length + StudentsListRight.length];

        int posLeft = 0, posRight = 0, curPos = 0;

        while(posLeft < StudentsListLeft.length && posRight < StudentsListRight.length) {

            StudentsListFinal[curPos++] = StudentsListLeft[posLeft].compareTo(StudentsListRight[posRight]) < 0 ? StudentsListLeft[posLeft++] : StudentsListRight[posRight++];

        }

        if(posLeft< StudentsListLeft.length) {

            arraycopy(StudentsListLeft, posLeft, StudentsListFinal, curPos, StudentsListLeft.length - posLeft);

        }
        else if(posRight< StudentsListRight.length) {

            arraycopy(StudentsListRight, posRight, StudentsListFinal, curPos, StudentsListRight.length - posRight);

        }

        return StudentsListFinal;
    }
}
