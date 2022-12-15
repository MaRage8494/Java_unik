import java.util.ArrayList;
import java.util.LinkedList;

class CollectionApp {
    public static void main(String[] args) {
        ArrayList<String> surname = new ArrayList<String>();
        ArrayList<String> surname_1 = new ArrayList<String>();

        surname_1.add("Gadzhiev");
        surname_1.add("Hitrov");

        surname.add("Sidorov");
        surname.add("Shutko");
        surname.addAll(surname_1);
        surname.add(1, "Vaidov");

        System.out.println("In list only "+ surname.size() +" surnames");
        System.out.println("Second surname: " + surname.get(1));
        surname.set(1, "Soldatenkova");
        System.out.println("Second command: " + surname.get(1));

        int i = 0;
        for (String sur : surname) {
            i++;
            System.out.println(i + ") " + sur);
        }


        if (surname.contains("Gadzhiev"))
            System.out.println("List contain Gadzhiev");
        else
            System.out.println("List doesn't contain Gadzhiev");

        surname.remove("Gadzhiev");

        if (surname.contains("Gadzhiev"))
            System.out.println("List contain Gadzhiev");
        else
            System.out.println("List doesn't contain Gadzhiev");


        surname.removeAll(surname_1);

        i = 0;
        for (String sur : surname) {
            i++;
            System.out.println(i + ") " + sur);
        }
    }
}
