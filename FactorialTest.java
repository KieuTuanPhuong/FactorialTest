
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    
    /* Test with number 0
     * 
     * Expected value: 1
     * Actual Value: 1
     * 
     * */
    @Test
    public void factorialZero() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(0);
        assertEquals(expected, actual);
    }
    
    /* Test with negative 1 (n = -1)
     * 
     * Expected value: 0
     * Actual Value: 0
     * 
     * */
    @Test
    public void factorialNegative1() {
        Factorial f = new Factorial();
        int expected = 0;
        int actual = f.fact(-1);
        assertEquals(expected, actual);
    }

    /* Test with negative number (n < 0)
     * 
     * Expected value: 0
     * Actual Value: 0
     * 
     * */
    @Test
    public void factorialNegative() {
        Factorial f = new Factorial();
        int expected = 0;
        int actual = f.fact(-100);
        assertEquals(expected, actual);
    }


    /* Test normal integer
     * 
     * Expected value: 120
     * Actual Value: 120
     * 
     * */
    @Test
    public void factorialFive() {
        Factorial f = new Factorial();
        int expected = 120;
        int actual = f.fact(5);
        assertEquals(expected, actual);
    }
    
    /* Test with n = 20
     * 
     * Expected value: 479,001,600
     * Actual Value: -2,102,132,736
     * 
     * */
    @Test
    public void factorial20() {
        Factorial f = new Factorial();
        int expected = 479001600;
        int actual = f.fact(20);
        assertEquals(expected, actual);
    }
    
    /* Test max integer
     * 
     * Expected value: -1 (out of range)
     * Actual Value: 0
     * 
     * */
    @Test
    public void factorialMax() {
        Factorial f = new Factorial();
        int expected = -1;
        int actual = f.fact(Integer.MAX_VALUE);
        assertEquals(expected, actual);
    }
    
    /* Test max integer + 1
     * 
     * Expected value: -1 (out of range)
     * Actual Value: 0
     * 
     * */
    @Test
    public void factorialMax1() {
        Factorial f = new Factorial();
        int expected = -1;
        int actual = f.fact(Integer.MAX_VALUE + 1);
        assertEquals(expected, actual);
    }


}