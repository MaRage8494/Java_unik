public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.color = "green";
        this.filled = true;
        this.width = 5;
        this.length = 10;
    }
    public Rectangle(double width, double length){
        this.color = "red";
        this.filled = false;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString(){
        return "Shape: Rectangle, width: " + this.width +", length: "+ this.length + ", color: " + this.color + ", filled: " + this.filled;
    }
}
