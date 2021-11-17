package lab4.exceptions;

public class DivByZeroException extends RuntimeException {
    public DivByZeroException(){
        super("Can't calculate salary for zero hours.");
    }
}