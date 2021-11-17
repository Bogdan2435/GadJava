package lab4.exceptions;

public class FewHoursException extends Exception {
    public FewHoursException(){
        super("Not enough hours exception.");
    }
}
