package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalindromeNumberTest {
    public boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev == original;
    }
    @Test
    public void testPalindromeTrue() {
        assertTrue(isPalindrome(121));
    }
    @Test
    public void testPalindromeFalse() {
        assertFalse(isPalindrome(123));
    }
    @Test
    public void testSingleDigitPalindrome() {
        assertTrue(isPalindrome(7));
    }
}
