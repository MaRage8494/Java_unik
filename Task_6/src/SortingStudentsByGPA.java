public class SortingStudentsByGPA implements Comparator{
    public SortingStudentsByGPA(Student[] students){
        System.out.println("Before:");
        for(int i = 0; i< students.length;i++){
            System.out.print(students[i].getName());
            System.out.println("(" + students[i].getGPA() + ")");
        }
        System.out.println();
        int high = students.length-1;
        quickSort(students, low, high);
        System.out.println("After:");
        for(int i = students.length-1; i >= 0;i--){
            System.out.print(students[i].getName());
            System.out.println("(" + students[i].getGPA() + ")");
        }
    }
    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        float opora = array[middle].getGPA();

        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGPA() < opora) {
                i++;
            }

            while (array[j].getGPA() > opora) {
                j--;
            }

            if (i <= j) {
                float temp = array[i].getGPA();
                String temp_name = array[i].getName();
                array[i].setGPA(array[j].getGPA());
                array[i].setName(array[j].getName());
                array[j].setGPA(temp);
                array[j].setName(temp_name);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
