//11 task
import java.util.Scanner;

public class Test_11 implements Convertable {
    public static void main(String[] args) {
        float degrees = 0;
        System.out.print("Celsius: ");
        Scanner celsius = new Scanner(System.in);
        degrees = celsius.nextFloat();
        convert(degrees);
    }
    public static void convert(float celsius) {
        float Fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit );
        float Kelvin = (celsius + 273.15f);
        System.out.println("Kelvin: " + Kelvin );
    }
}
