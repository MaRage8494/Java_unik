public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        circle.setRadius(20);
        System.out.println(circle);
    }
}