
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void factorialZero() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(0);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialOne() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(1);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTwo() {
        Factorial f = new Factorial();
        int expected = 2;
        int actual = f.fact(2);
        assertEquals(expected, actual);
    }


    @Test
    public void factorialFive() {
        Factorial f = new Factorial();
        int expected = 120;
        int actual = f.fact(5);
        assertEquals(expected, actual);
    }


}