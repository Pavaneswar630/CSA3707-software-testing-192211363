package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringIgnoreCaseTest {
    public boolean compareIgnoreCase(String s1, String s2) {
        if
 (s1 == null || s2 == null)
            return false;
        return s1.equalsIgnoreCase(s2);
    }
    @Test
    public void testEqualIgnoreCase() {
        assertTrue(compareIgnoreCase("Java", "java"));
    }
    @Test
    public void testNotEqualIgnoreCase() {
        assertFalse(compareIgnoreCase("Java", "Python"));
    }
    @Test
    public void testNullCase() {
        assertFalse(compareIgnoreCase(null, "test"));
    }
}