public class Circle{
    protected double radius;
    public Circle(double radius){
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
        return "Radius: " + this.radius + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }
}
