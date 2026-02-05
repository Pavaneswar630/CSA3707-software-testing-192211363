package junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class PrimeNumberTest {
    public boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    @Test
    public void testPrimeTrue() {
        assertTrue(isPrime(13));
    }
    @Test
    public void testPrimeFalse() {
        assertFalse(isPrime(12));
    }
    @Test
    public void testPrimeOne() {
        assertFalse(isPrime(1));
    }
}