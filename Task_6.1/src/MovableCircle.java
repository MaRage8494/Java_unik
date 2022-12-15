//1 task
public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    MovablePoint center = new MovablePoint(10,10,2,2);
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center.x += x;
        center.y += y;
        center.xSpeed += xSpeed;
        center.ySpeed += ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle, x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed + ", radius: " + this.radius;
    }

    public void moveUp(){
        y += 1;
    }
    public void moveDown() {
        y -= 1;
    }
    public void moveRight() {
        x += 1;
    }
    public void moveLeft() {
        x -= 1;
    }
}
