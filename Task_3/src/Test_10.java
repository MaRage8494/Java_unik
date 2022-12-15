//10 task
import java.util.ArrayList;
import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<Computer>();
        Shop shop = new Shop();
        int i = 0;
        Names[] names = Names.values();
        while (true) {
            System.out.print("Choose action (1 add, 2 delete, 3 search): ");
            Scanner action = new Scanner(System.in);
            switch (action.nextInt()) {
                case 1:
                    System.out.println("Monitor resolution, Processor, Memory capacity:");
                    Scanner monitor = new Scanner(System.in);
                    Scanner processor = new Scanner(System.in);
                    Scanner memory = new Scanner(System.in);
                    shop.add(new Monitor(monitor.nextLine()), new Processor(processor.nextLine()),new Memory(memory.nextInt()), names[i]);
                    i++;
                    break;
                case 2:
                    System.out.println("Whats model you want delete?");
                    Scanner name = new Scanner(System.in);
                    shop.del(name.nextLine());
                    break;
                case 3:
                    System.out.println("Whats model you want search?");
                    Scanner name2 = new Scanner(System.in);
                    shop.search(name2.nextLine());
                    break;
            }
        }
    }
}
enum Names{
    MSI,
    ASUS,
    ACER,
    GIGABYTE,
    DELL
}