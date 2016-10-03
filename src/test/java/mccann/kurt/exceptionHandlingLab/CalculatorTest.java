package mccann.kurt.exceptionHandlingLab;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by kurtmccann on 10/2/16.
 */
public class CalculatorTest
{
    @Test
    public void addTest()
    {
        Calculator c1 = new Calculator();
        int actual = c1.add(3,4);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest()
    {
        Calculator c1 = new Calculator();
        int actual = c1.subtract(3,4);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest()
    {
        Calculator c1 = new Calculator();
        int actual = c1.multiply(3,4);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void divideTest() throws DivisionByZeroException
    {
        Calculator c1 = new Calculator();
        int actual;
        try
        {
            actual = c1.divide(15, 4);
        }
        catch(DivisionByZeroException e)
        {
            System.out.println("You seem to have divided by zero, despite my warnings");
            e.printStackTrace();
            throw e;
        }

        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test(expected = DivisionByZeroException.class)
    public void divideByZeroTest() throws DivisionByZeroException
    {
        Calculator c1 = new Calculator();
        c1.divide(15,0);

    }

    @Test
    public void squareRootHappyPathTest()
    {
        Calculator c1 = new Calculator();
        int expected = 3;
        int actual = c1.squareRoot(9);
        assertEquals("Expect 3", expected, actual);
    }
    @Test(expected = ComplexNumberException.class)
    public void squareRootOfNegativeTest() throws ComplexNumberException
    {
        Calculator c1 = new Calculator();
        c1.squareRoot(-20);
    }
}
