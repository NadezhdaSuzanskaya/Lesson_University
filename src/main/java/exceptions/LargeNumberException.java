package exceptions;

public class LargeNumberException extends Exception {

    public LargeNumberException(String msg)
    {
        super(msg);
    }

    public LargeNumberException()
    {
        super("A value must be less than 100!");
    }
}
