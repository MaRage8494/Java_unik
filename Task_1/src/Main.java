public class Main {
    public static void main(String[] args) {
        Dog dog_1 = new Dog(5, 10.2, "Max");
        Dog dog_2 = new Dog(10, 5.7);
        Dog dog_3 = new Dog();
        dog_1.speedCompare(dog_2);
        dog_3.speedCompare(dog_1);
        System.out.println("Count dog: " + Dog.dogCount);

        System.out.println();
        System.out.println();

        Ball ball_1 = new Ball(300, 16, "Adidas" );
        Ball ball_2 = new Ball(200, 15);
        ball_1.compareDistance(ball_2);
        System.out.println("Count ball" + Ball.ballCount);

        System.out.println();
        System.out.println();

        Book book_1 = new Book(300, "Atlant Raspravil Plechi", 400);
        Book book_2 = new Book(400, 200);
        Book book_3 = new Book();
        book_1.compareUtility(book_2);
        book_3.compareUtility(book_1);
        System.out.println("Books available: " + Book.bookAvailable);
    }
}