interface Movable{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed(){
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "Coord (" + x + ", " + y +
                ")\nSpeed (" + xSpeed + ", " + ySpeed + ")";
    }

    public void moveUp(){
        y += ySpeed;
    }

    public void moveDown(){
        y -= ySpeed;
    }

    public void moveLeft(){
        x -= xSpeed;
    }

    public void moveRight(){
        x += xSpeed;
    }

}

class MovableRectangle implements Movable{
    private MovablePoint LeftUp;
    private MovablePoint RightDown;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        LeftUp = new MovablePoint(x1, y1, xSpeed, ySpeed);
        RightDown = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp(){
        LeftUp.moveUp();
        RightDown.moveUp();
    }

    public void moveDown(){
        LeftUp.moveDown();
        RightDown.moveDown();
    }

    public void moveLeft(){
        LeftUp.moveLeft();
        RightDown.moveLeft();
    }

    public void moveRight(){
        LeftUp.moveRight();
        RightDown.moveRight();
    }

    public Boolean speedTest(){
        return ((LeftUp.getXSpeed() == RightDown.getXSpeed())&&(LeftUp.getYSpeed() == RightDown.getYSpeed()));
    }

    public String toString(){
        return "Left Up point:\n" + LeftUp.toString() + "\nRight Down point:\n" +RightDown.toString();
    }
}

interface mathCalculate{
    double numPI = Math.PI;

    public double raisePower(double value, int powValue);
    public double moduleOfComplex(double realPart, double imPart);
}

class mathFunc implements mathCalculate{

    public mathFunc(){}

    public double moduleOfComplex(double realPart, double imPart) {
        return Math.sqrt(realPart*realPart + imPart*imPart);
    }

    public double raisePower(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    public double areaOfCircle(double radius){
        return numPI*raisePower(radius, 2);
    }
}

interface strings{
    public int getLength(String a);
    public String getOddString(String a);
    public String invertSting(String a);
}

class ProcessString implements strings{

    public ProcessString(){}

    public int getLength(String a){
        return a.length();
    }

    public String getOddString(String a){
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = 1; i < s.length(); i+=2)
            returnString.append(s.charAt(i));

        return new String(returnString);
    }

    public String invertSting(String a){
        StringBuilder returnString = new StringBuilder();
        StringBuilder s = new StringBuilder(a);

        for(int i = s.length() - 1; i >= 0; i--)
            returnString.append(s.charAt(i));

        return new String(returnString);
    }
}

interface Printable{
    void print();
}

class Book implements Printable{
    String name;
    String author;
    int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author; this.year = year;
    }

    public void print() {
        System.out.printf("Book '%s' (author %s) was published in %d\n", name, author, year);
    }

    static void printBooks(Printable[] printable){
        System.out.println("Books in list: ");
        for(Printable print: printable){
            if (print instanceof Book)
                print.print();
        }
    }
}

class Journal implements Printable {
    private String name;

    String getName(){ return name;}

    Journal(String name){ this.name = name;}

    public void print() {
        System.out.printf("Magazine '%s'\n", name);
    }

    static void printJournals(Printable[] printable){
        System.out.println("Magazines in list: ");
        for(Printable print: printable){
            if (print instanceof Journal)
                print.print();
        }
    }
}


public class Main  {
    public static void main(String[] args) {
        // test 1 - 3
        MovableRectangle rect = new MovableRectangle(0, 0, 4, 4, 5, 5);
        System.out.println("Before move:\n" + rect.toString());
        rect.moveDown();
        rect.moveRight();
        System.out.println("\nAfter move:\n" + rect.toString());
        rect.moveUp();
        rect.moveLeft();
        System.out.println("\nAfter move:\n" + rect.toString());


        // test 4
        mathFunc calc = new mathFunc();
        System.out.println("Module of complex num (4 + 3i) = " + calc.moduleOfComplex(4.0, 3.0));
        System.out.println("2^3 = " + calc.raisePower(2, 3));
        System.out.println("Area of circle with radius 4 = " + calc.areaOfCircle(4));


        // test 5 - 6
        ProcessString process = new ProcessString();
        System.out.println(process.getLength("01234"));
        System.out.println(process.getOddString("01234"));
        System.out.println(process.invertSting("01234"));

        //test 7 - 8
        Printable[] array = new Printable[4];
        array[0] = new Book("1984", "George Ourell", 1949);
        array[1] = new Book("Bible", "-", 0);
        array[2] = new Journal("Cars");
        array[3] = new Journal("Toys");
        Book.printBooks(array);
        Journal.printJournals(array);

    }
}