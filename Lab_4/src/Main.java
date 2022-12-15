public class Main {
    public static void main(String[] args) {
        Book book = new Book(299,"1984");
        Game game = new Game(599, "DOOM");
        System.out.println(book.getPrice() + "p");
        System.out.println(game.getPrice() + "p");
    }
}