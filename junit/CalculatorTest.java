package junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // Method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Test case using ONE annotation and ONE assertion
    @Test
    public void testAddition() {
        int result = add(10, 20);
        assertEquals(30, result);
    }
}