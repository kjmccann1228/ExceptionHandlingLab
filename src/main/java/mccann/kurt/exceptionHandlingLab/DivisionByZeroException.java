package mccann.kurt.exceptionHandlingLab;

/**
 * Created by kurtmccann on 10/2/16.
 */
public class DivisionByZeroException extends Exception
{
    public DivisionByZeroException(){}
    public DivisionByZeroException(String message)
    {
        super(message);
    }
}
