//4,6,7 task
public class Book implements Nameable, Printable{
    @Override
    public void print() {
        System.out.println(name + " " + price);
    }
    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Book(){}
    public String getName(){
        return name;
    }
    String name;
    int price;

    public int getPrice() {
        return price;
    }
}
