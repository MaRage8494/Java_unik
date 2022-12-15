import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Task_1();
        System.out.println();
        Task_2("Gadzhiev", "Marat", "Timurovich");
        System.out.println();
        Task_3();
        System.out.println();
        Task_4();
        System.out.println();
        Task_5();
        System.out.println();
        Task_6();
    }
    public static void Task_1(){
        Task_1_1("Hello World!");
        Task_1_2("Hello World!");
        Task_1_3("Hello World!!!");
        Task_1_4("Hello World!");
        Task_1_5("Hello World!");
        Task_1_6("Hello World!");
        Task_1_7("Hello World!");
        Task_1_8("Hello World!");
        Task_1_9("Hello World!");
        Task_1_10("Hello World!");
    }
    public static void Task_2(String surname, String name, String patronymic){
        new Person(surname, name, patronymic);
        new Person(surname, patronymic);
        new Person(surname);
    }
    public static void Task_3(){
        new Address("Russia, MOS, Moscow, 11th Parkovaya, 36, 1, 1014");
    }
    public static void Task_4(){
        Shirt[] shirt = new Shirt[11];
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for (int i = 0; i < shirts.length; i++){
            shirt[i] = new Shirt(shirts[i]);
        }
        for (int i = 0; i < shirt.length; i++){
            System.out.println(shirt[i]);
        }
    }
    public static void Task_5(){
        new Telephone("+79282282828");
    }
    public static void Task_6() throws IOException{
        String fileName = "D:\\Projects Java\\Task_13\\src\\file.txt";

        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        String[] words = content.split(" ");

        StringBuilder result = Solution.getLine(words);
        System.out.println(result.toString());
    }
    public static void Task_1_1(String str){
        System.out.println(str);
    }
    public static void Task_1_2(String str){
        System.out.println(str.charAt(11));
    }
    public static void Task_1_3(String str){
        System.out.println(str.endsWith("!!!"));
    }
    public static void Task_1_4(String str){
        System.out.println(str.startsWith("Hello"));
    }
    public static void Task_1_5(String str){
        System.out.println(str.contains("World"));
    }
    public static void Task_1_6(String str){
        System.out.println(str.indexOf("World"));
    }
    public static void Task_1_7(String str){
        System.out.println(str.replace("o","a"));
    }
    public static void Task_1_8(String str){
        System.out.println(str.toUpperCase());
    }
    public static void Task_1_9(String str){
        System.out.println(str.toLowerCase());
    }
    public static void Task_1_10(String str){
        System.out.println(str.substring(6));
    }
}