package mccann.kurt.exceptionHandlingLab;

/**
 * Created by kurtmccann on 10/2/16.
 */
public class Calculator
{
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int subtract(int a, int b)
    {
        return a-b;
    }

    public static int multiply(int a, int b)
    {
        return a*b;
    }

    public static int squareRoot(int a) throws ComplexNumberException
    {
        if(a <= 0)
        {
            throw new ComplexNumberException("Don't want complex numbers. Argument must be positive");
        }
        else
        {
            return(int)(Math.sqrt((double) a));
        }
    }

    public static int divide(int a, int b) throws DivisionByZeroException
    {
        if(b==0)
        {
            throw new DivisionByZeroException("CAN'T DIVIDE BY ZERO");
        }
        else
        {
            return a/b;
        }
    }
}
