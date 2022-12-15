//2 task
public class MovableRectangle extends MovablePoint implements Movable {
    MovablePoint topLeft = new MovablePoint();
    MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        bottomRight.x = x2;
        topLeft.y = y1;
        bottomRight.y = y2;
        if (xSpeed == ySpeed) {
            topLeft.xSpeed = bottomRight.xSpeed = xSpeed;
            topLeft.ySpeed = bottomRight.ySpeed = ySpeed;
        }
        else {
            System.out.println("ERROR, Speeds are not same");
        }
    }
    @Override
    public String toString(){
        if (topLeft.xSpeed != topLeft.ySpeed){
            return "ERROR, Speeds are not same";
        }
        return "Rectangle, x1: " + topLeft.x + ", y1: " + topLeft.y + ", x2: " + bottomRight.x + ", y2: " + bottomRight.y + ", xSpeed: " + topLeft.xSpeed + ", ySpeed: " + bottomRight.ySpeed;
    }

    public void moveUp(){
        topLeft.y += 1;
        bottomRight.y += 1;
    }
    public void moveDown() {
        topLeft.y -= 1;
        bottomRight.y -= 1;
    }
    public void moveRight() {
        topLeft.x += 1;
        bottomRight.x += 1;
    }
    public void moveLeft() {
        topLeft.x -= 1;
        bottomRight.x -= 1;
    }
}
