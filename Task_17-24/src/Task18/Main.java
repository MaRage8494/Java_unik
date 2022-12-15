package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
//        Task1();
//        Task2();
//        Task3();
        Task4();
//        Task5(null);
//        Task6("SDs");
//        Task7();
//        Task8();
    }
    public static void Task1(){
//        System.out.println( 2 / 0 );
//        System.out.println( 2.0 / 0.0 );
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void Task2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.out.println("Ne int");
        }
    }
    public static void Task3() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.out.println("Ne int");
        }
        catch (Exception e){
            System.out.println("Poymal");
        }
    }
    public static void Task4() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.out.println("Ne int");
        }
        finally {
            System.out.println("vivod finally");
        }
    }
    public static void Task5(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        } catch (NullPointerException e) {
            System.out.println("null in arguments");
        }
        return "";
    }
    public static void Task6(String key) {
        getDetails2(key);
    }
    public static void getDetails2(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            printMessage(key);
        } catch (NullPointerException e) {
            System.out.println("null in arguments");
        }
    }
    public static void printMessage(String key){
        System.out.println(key);
    }
//    public static void Task7(){
//        Scanner myScanner = new Scanner(System.in);
//        String key = myScanner.next();
//        printDetails3( key );
//    }
//    public static void printDetails3(String key) {
//        try {
//            String message = getDetails3(key);
//            System.out.println( message );
//        }
//        catch ( Exception e){
//            throw e;
//        }
//    }
//    private static String getDetails3(String key) {
//        if(key == "") {
//            throw new Exception( "Key set to empty string" );
//        }
//        return "data for " + key;
//    }
    public static void Task8(){
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.next();
            printDetails4(key);
        }
        catch (Exception e){
            System.out.println("Key set to empty string");
            Task8();
        }

    }
    public static void printDetails4(String key) throws Exception{
        try {
            String message = getDetails4(key);
            System.out.println( message );
        }
        catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails4(String key) throws Exception{
        if(key.equals("A")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
