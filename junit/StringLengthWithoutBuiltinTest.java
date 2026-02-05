package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringLengthWithoutBuiltinTest {
    public int findLength(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            count++;
        }
        return count;
    }
    @Test
    public void testStringLengthNormal() {
        assertEquals(5, findLength("Hello"));
    }
    @Test
    public void testStringLengthEmpty() {
        assertEquals(0, findLength(""));
    }
    @Test
    public void testStringLengthWithSpaces() {
        assertEquals(11, findLength("Hello World"));
    }
}
