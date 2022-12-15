public class Book implements Priceable{
    private String name;
    private int price;
    public Book (int price, String name){
        this.price = price;
        this.name = name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
