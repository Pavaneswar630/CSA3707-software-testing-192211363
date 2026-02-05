package junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class ReverseNumberTest {
    public int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
    @Test
    public void testReverseNormal() {
        assertEquals(321, reverseNumber(123));
    }
    @Test
    public void testReverseWithZero() {
        assertEquals(21, reverseNumber(120));
    }
    @Test
    public void testReverseSingleDigit() {
        assertEquals(7, reverseNumber(7));
    }
}
