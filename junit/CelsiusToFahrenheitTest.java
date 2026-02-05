package junit;
import org.junit.Test;
import static org.junit.Assert.*;
public class CelsiusToFahrenheitTest {
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    @Test
    public void testConversionNormal() {
        assertEquals(98.6, convertToFahrenheit(37), 0.1);
    }
    @Test
    public void testConversionZero() {
        assertEquals(32.0, convertToFahrenheit(0), 0.01);
    }
    @Test
    public void testConversionNegative() {
        assertEquals(14.0, convertToFahrenheit(-10), 0.01);
    }
}
