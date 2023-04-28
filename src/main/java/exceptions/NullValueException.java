package exceptions;

public class NullValueException extends Exception{
    public NullValueException(String msg)
    {
        super(msg);
    }

    public NullValueException()
    {
        super("Value can't be null!");
    }

}
