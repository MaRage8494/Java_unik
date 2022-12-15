import java.util.ArrayList;
import java.util.Arrays;

//8, 10 task
public class Shop implements Printable{
    ArrayList<Computer> computers = new ArrayList<Computer>();
    static int count = 0;
    public void add(Monitor monitor, Processor processor, Memory memory, Names name){
        computers.add(new Computer(monitor.resolution, processor.model, memory.capacity, name));
        count++;
    }
    public void del (String name){
        for (Computer computer:computers){
            if(computer.getName().equals(name)){
                computers.remove(computer);
                break;
            }
            System.out.println("Not Found");
            break;
        }
    }
    public void search(String name){
        for (Computer computer:computers){
            if(computer.getName().equals(name)){
                System.out.println("Name computer: "+computer.name + ", " + "Processor: " + computer.processor + ", " + "Memory capacity: " + computer.memory + "GB, " + "Monitor resolution: " + computer.monitor);
                break;
            }
            System.out.println("Not Found");
            break;
        }
    }
    @Override
    public void print() {
        System.out.println();
    }
}
