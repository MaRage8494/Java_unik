package Task19;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("Empty string not allowed");
    }

}
