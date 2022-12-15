public class Square extends Rectangle{
    public Square(){
        this.color = "green";
        this.filled = true;
        this.width = 10;
    }
    public Square(double side){
        this.color = "violet";
        this.filled = false;
        this.width = side;
    }
    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = side;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width = side;
    }
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "Shape: Square, side: " + this.width + ", color: " + this.color + ", filled: " + this.filled;
    }
}
