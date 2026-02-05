package junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class CompoundInterestTest {
    public double calculateCompoundInterest(double p, double r, int t) {
        double amount = p * Math.pow((1 + r / 100), t);
        return amount - p;
    }
    @Test
    public void testCompoundInterest() {
        assertEquals(210.0, calculateCompoundInterest(1000, 10, 2), 0.01);
    }
    @Test
    public void testCompoundInterestOneYear() {
        assertEquals(100.0, calculateCompoundInterest(1000, 10, 1), 0.01);
    }
    @Test
    public void testCompoundInterestZeroRate() {
        assertEquals(0.0, calculateCompoundInterest(1000, 0, 5), 0.01);
    }
}