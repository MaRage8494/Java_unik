public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.color = "red";
        this.filled = true;
        this.radius = 5;
    }
    public Circle(double radius){
        this.color = "blue";
        this.filled = false;
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Shape: Circle, radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled;
    }
}
