package exceptions;

public class NullValueException extends NullPointerException{
    public NullValueException(String msg)
    {
        super(msg);
    }

    public NullValueException()
    {
        super("Value can't be null!");
    }

}
