package exceptions;

public class NegativeValueException extends Exception {

    public NegativeValueException(String msg)
    {
        super(msg);
    }

    public NegativeValueException()
    {
        super("A value must be greater than 0!");
    }
}
