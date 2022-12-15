import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("For finish type \"exit\"");
        try (FileWriter writer = new FileWriter("D:\\Projects Java\\Lab_8\\src\\file.txt")){
            String currentText = "";
            do{
                System.out.print("- ");
                currentText = textScanner.nextLine();
                if(!currentText.toLowerCase().equals("exit")){
                    writer.write(currentText);
                    writer.write('\n');
                    writer.flush();
                }
                else{
                    break;
                }
            } while(!currentText.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}