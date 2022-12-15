public class Test_rect {
    public static void main(String[] args){
        MovableRectangle rectangle = new MovableRectangle(0, 5, 0, 10,2,2);
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
        rectangle.topLeft.xSpeed = 4;
        System.out.println(rectangle);
    }
}
