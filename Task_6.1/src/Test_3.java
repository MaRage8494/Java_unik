//3,4,6,9 task
public class Test_3 {
    public static void main(String[] args){
        Book book = new Book();
        book.name = "1984";
        book.price=399;
        System.out.println(book.getName() + " " + book.getPrice());
        Printable[] print = new Printable[5];
        print[0] = new Book("Bible",699);
        print[1] = new Book("Mumu",199);
        print[2] = new Book("Vogue",399);
        print[3] = new Book("It",599);
        print[4] = book;
        for (int i = 0; i < 5; i++){
            print[i].print();
        }
    }
}
