package exceptions;

public class LongValueException extends Exception{

    public LongValueException(String msg)
        {
            super(msg);
        }

    public LongValueException()
        {
            super("Value can't be more than 15 characters!");
        }
}
