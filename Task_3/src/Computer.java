//10 task
public class Computer {
    String monitor;
    String processor;
    String name;
    int memory;
    public Computer(String monitor, String processor, int memory, Names name){
        this.name = name.toString();
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }
}
