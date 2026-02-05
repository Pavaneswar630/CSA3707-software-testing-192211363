package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringComparisonTest {
    public boolean compareStrings(String s1, String s2) {
        if
 (s1 == null || s2 == null)
            return false;
        return s1.equals(s2);
    }
    @Test
    public void testStringEqual() {
        assertTrue(compareStrings("Java", "Java"));
    }
    @Test
    public void testStringNotEqual() {
        assertFalse(compareStrings("Java", "Python"));
    }
    @Test
    public void testNullString() {
        assertFalse(compareStrings(null, "Test"));
    }
}