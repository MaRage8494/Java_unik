import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Formatter;


class testClass{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public testClass(){}

    public void Task_1(){
        Integer[] arr = new Integer[10], arrRand = new Integer[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = ((int) (Math.random() * 10));


        for (int i = 0; i < arrRand.length; i++)
            arrRand[i] = random.nextInt((Integer)10);

        System.out.println("Original array:   " + Arrays.toString(arr));
        System.out.println("Random array: " + Arrays.toString(arrRand));

        Arrays.sort(arr);
        Arrays.sort(arrRand);

        System.out.println("Sorted original array:   " + Arrays.toString(arr));
        System.out.println("Sorted random array: " + Arrays.toString(arrRand));
    }

    public void Task_3(){
        int[] arr = new int[4];

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 99);
            System.out.print(arr[i] + " ");
        }

        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3])
            System.out.println("\nYes");
        else
            System.out.println("\nNo");


    }

    public void Task_4(){
        int size = -1, even = 0;
        int[] arr, arrEven;

        System.out.print("Enter size of array: ");
        do{
            size = scanner.nextInt();
            if(size < 1)
                System.out.print("Number should be more then 0, repeat enter please: ");
        }while (size < 1);

        arr = new int[size];
        arrEven = new int[size];
        System.out.print("Array: ");
        for(int num:arr) {
            num = random.nextInt(0, size);
            System.out.print(num + " ");
            if (num % 2 == 0) {
                even++;
                arrEven[even-1] = num;
            }
        }

        System.out.print("\nEven array: ");
        for (int i =0; i< even; i++)
            System.out.print(arrEven[i] + " ");

    }

    public void doubleTest(){
        Double one = Double.valueOf("3.14");
        System.out.println(one);

        one = Double.parseDouble("11.01");
        System.out.println(one);

        int two = 123;
        one = (double)two;
        System.out.println(one);

        String three = Double.toString((one+0.11));
        System.out.println(three);
    }
}

class Point{
    int x;
    int y;

    public Point(int x ,int y){
        this.x = x;
        this.y = y;
    }
}

class Circle{
    Point center;
    int radius;

    public Circle(int x, int y, int radius){
        center = new Point(x, y);
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }
}

class Tester{
    Circle[] arrCircle;
    int quantity;
    Random random = new Random();

    public Tester(int quantity){
        this.quantity = quantity;
        arrCircle = new Circle[quantity];

        for(int i = 0; i < this.quantity; i++)
            arrCircle[i] = new Circle(random.nextInt(25), random.nextInt(25),
                    random.nextInt(100));
    }

    public Circle minCircle(){
        Circle min = arrCircle[0];

        for (Circle circle : arrCircle) {
            if (circle.getRadius() < min.getRadius())
                min = circle;
        }
        return min;
    }

    public Circle maxCircle(){
        Circle max = arrCircle[0];

        for (Circle circle : arrCircle) {
            if (circle.getRadius() > max.getRadius())
                max = circle;
        }

        return max;
    }

    public void sortCircles(){
        Arrays.sort(arrCircle, Comparator.comparingInt(Circle::getRadius));
    }

    public String toString(){
        String result = "";

        for(Circle circle : arrCircle){
            result += circle.getRadius() + ", ";
        }

        result = result.substring(0, result.length() - 2);

        return result;
    }
}

class Converter{
    String[] currencyList = {"RUB", "USD", "EUR", "GPB"};
    Scanner scanner = new Scanner(System.in);
    double[][] convertTable = {
            {1.0, 0.017, 0.017, 0.015},
            {60.2, 1.0, 1.02, 0.9},
            {57.45, 0.98, 1.0, 0.88},
            {67.12, 1.11, 1.14, 1.0},
    };

    public Converter(){}

    public void startProgram(){
        int choose = -1;

        do{
            System.out.println("0 - End Converter`s work");
            for(int i =0; i < currencyList.length; i++)
                System.out.printf("%d - %s\n", i + 1, currencyList[i]);
            System.out.print("Choose start currency: ");

            do {
                choose = scanner.nextInt();
                if(choose < 0 || choose > 4)
                    System.out.print("Wrong number of currency, repeat enter: ");
            } while(choose < 0 || choose > 4);

            if (choose != 0)
                convertCurrency(choose - 1);

        }while (choose != 0);

        System.out.println("| End of Converter`s work |");
    }

    private void convertCurrency(int startCurrencyNum){
        int chooseEnd = -1;

        for(int i =0; i < currencyList.length; i++) {
            if (i != startCurrencyNum)
                System.out.printf("%d - %s\n", i + 1, currencyList[i]);
        }
        System.out.print("Choose end currency: ");

        do {
            chooseEnd = scanner.nextInt();
            if(chooseEnd < 0 || chooseEnd > 4 || chooseEnd == startCurrencyNum)
                System.out.print("Wrong number of currency, repeat enter: ");
        } while(chooseEnd < 0 || chooseEnd > 4 || chooseEnd == startCurrencyNum);

        chooseEnd--;
        System.out.print("Which amount of " + currencyList[startCurrencyNum] + " convert to " +
                currencyList[chooseEnd] + ": " );

        double startAmount = (double) scanner.nextInt();
        double endAmount = startAmount * convertTable[startCurrencyNum][chooseEnd];
        System.out.printf("-= For %.2f %s you will get %.2f %s\n", startAmount, currencyList[startCurrencyNum],
                endAmount, currencyList[chooseEnd]);
    }

}

class Employee{
    String fullName;
    double salary;

    public Employee(String fullName, double salary){
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}

class Report{
    Scanner scanner = new Scanner(System.in);

    public Report(){
    }

    static void generateReport(Employee[] listOfEmployees){
        Formatter formatter = new Formatter();

        for (Employee listOfEmployee : listOfEmployees)
            formatter.format("| %-30s %8.2f |\n", listOfEmployee.getFullName(), listOfEmployee.getSalary());

        System.out.println(formatter);
    }
}

public class Main {
    public static void main(String[] args) {

        testClass testObj = new testClass();
        testObj.Task_1();
        System.out.println("\n\n");

        Tester circlesTest = new Tester(10);
        System.out.println("Circle array: " + circlesTest.toString());
        circlesTest.sortCircles();
        System.out.println("Sorted circle array: " + circlesTest.toString());
        System.out.println("Min circle: " + circlesTest.minCircle().getRadius());
        System.out.println("Max circle: " + circlesTest.maxCircle().getRadius());
        System.out.println("\n\n");

        testObj.Task_3();
        System.out.println("\n\n");

        testObj.Task_4();
        System.out.println("\n\n");

        testObj.doubleTest();

        Converter conv = new Converter();
        conv.startProgram();

        Scanner scanner = new Scanner(System.in);
        int numOfEmployees = 3;
        Employee[] listOfEmployees = new Employee[numOfEmployees];

        for (int i = 0; i < listOfEmployees.length; i++){
            System.out.print("Enter employee name: ");
            String tempString = scanner.next();
            System.out.print("Enter employee`s salary: ");
            double tempInt = (double) scanner.nextInt();
            listOfEmployees[i] = new Employee(tempString, tempInt);
        }

        Report.generateReport(listOfEmployees);
    }
}