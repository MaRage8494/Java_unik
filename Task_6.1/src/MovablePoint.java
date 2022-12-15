//1, 2 task
public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(){}
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "Point, x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    public void moveUp() {
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
