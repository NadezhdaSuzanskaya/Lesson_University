package exceptions;

public class SpecificSymbolException extends Exception{
    public SpecificSymbolException(String msg)
    {
        super(msg);
    }

    public SpecificSymbolException()
    {
        super("Name value must not contain special characters");
    }
}
