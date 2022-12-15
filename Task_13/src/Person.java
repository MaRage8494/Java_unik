public class Person {
    String name;
    String surname;
    String patronymic;
    public Person (String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        System.out.println(name + " " + surname  + " " + patronymic);
    }
    public Person (String surname, String patronymic) {
        this.surname = surname;
        this.patronymic = patronymic;
        System.out.println(surname + " " + patronymic);
    }
    public Person (String surname) {
        this.surname = surname;
        System.out.println(surname);
    }
}
