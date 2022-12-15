public class Book {
    private int pages;
    private String name;
    private int price;
    static int bookAvailable;
    public Book (int pages, String name, int price){
        this.pages = pages;
        this.name = name;
        this.price = price;
        bookAvailable+=1;
    }
    public Book (int pages,int price){
        this.pages = pages;
        this.price = price;
        this.name = "Gore ot uma";
        bookAvailable+=1;
    }
    public Book (){
        this.pages = 237;
        this.price = 499;
        this.name = "1984";
        bookAvailable+=1;
    }
    private double utility(){
        double utility = this.price/this.pages;
        return utility;
    }
    public void compareUtility(Book anotherBook){
        if (anotherBook.utility() > this.utility()){
            System.out.println(anotherBook.name + " more utility than " + this.name);
        }
        else{
            System.out.println(this.name + " more utility than " + anotherBook.name);
        }
    }
}
