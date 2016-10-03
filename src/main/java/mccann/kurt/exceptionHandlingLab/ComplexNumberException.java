package mccann.kurt.exceptionHandlingLab;

/**
 * Created by kurtmccann on 10/2/16.
 */
public class ComplexNumberException extends ArithmeticException
{
    public ComplexNumberException(){}
    public ComplexNumberException(String message)
    {
        super(message);
    }

}
