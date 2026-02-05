package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class LargestElementArrayTest {
    public int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    @Test
    public void testLargestNormal() {
        assertEquals(9, findLargest(new int[]{2, 5, 9, 1}));
    }
    @Test
    public void testLargestNegative() {
        assertEquals(-1, findLargest(new int[]{-10, -5, -1, -20}));
    }
    @Test
    public void testLargestSameValues() {
        assertEquals(7, findLargest(new int[]{7, 7, 7}));
    }
}
