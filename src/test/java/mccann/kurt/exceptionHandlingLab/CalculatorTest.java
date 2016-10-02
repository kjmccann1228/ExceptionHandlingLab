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
    public void divideTest()
    {
        Calculator c1 = new Calculator();
        int actual = c1.divide(15,4);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void divideByZeroTest()
    {
        Calculator c1 = new Calculator();
        int actual = c1.divide(15,0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
