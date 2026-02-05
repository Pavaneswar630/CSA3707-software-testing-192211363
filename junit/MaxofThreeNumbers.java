package junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class MaxofThreeNumbers{
    public int findMax(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        return max;
    }
    @Test
    public void testMaxNormal() {
        assertEquals(30, findMax(10, 20, 30));
    }
    @Test
    public void testMaxNegative() {
        assertEquals(-5, findMax(-10, -5, -20));
    }
    @Test
    public void testMaxSameValues() {
        assertEquals(15, findMax(15, 15, 15));
    }
}