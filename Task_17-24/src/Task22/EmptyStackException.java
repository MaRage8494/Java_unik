package Task22;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty! Retry with another expression");
    }
}
