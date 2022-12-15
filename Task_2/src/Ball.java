public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 5;
        this.y = 5;
    }
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }
    @Override
    public String toString(){
        return "Ball @ " + "(" + this.x + " , " + this.y + ")" + ".";
    }
}
