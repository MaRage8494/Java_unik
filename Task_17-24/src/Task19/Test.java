package Task19;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList<>();
        alStudents.add(new Student("Marat", "Gadzhiev", "Programmer",2, "IKBO-20-21",5));
        alStudents.add(new Student("Egor", "Uzbekov", "Scientist", 2, "IKBO-20-21", 3));
        new LabClassUI(alStudents);
    }
}
