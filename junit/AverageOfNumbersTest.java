package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class AverageOfNumbersTest {
    public double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    @Test
    public void testAverageNormal() {
        assertEquals(3.0, findAverage(new int[]{1, 2, 3, 4, 5}), 0.01);
    }
    @Test
    public void testAverageSingle() {
        assertEquals(10.0, findAverage(new int[]{10}), 0.01);
    }
    @Test
    public void testAverageZeros() {
        assertEquals(0.0, findAverage(new int[]{0, 0, 0}), 0.01);
    }
}