package Task22;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("Empty string not allowed");
    }
}
