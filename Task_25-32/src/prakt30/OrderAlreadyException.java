package prakt30;

public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(int address){
        super("The order for " + address + " is added!");
    }
}