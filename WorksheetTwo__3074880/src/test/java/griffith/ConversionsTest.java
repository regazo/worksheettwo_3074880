package griffith;
//zakarea erezzaghi 3074880

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {

    // Unit test for celsiusToFahrenheit method
    @Test
    public void testCelsiusToFahrenheit() {
        double result1 = Conversions.celsiusToFahrenheit(0);
        assertEquals(32, result1, "0 Celsius should be 32 Fahrenheit");

        double result2 = Conversions.celsiusToFahrenheit(100);
        assertEquals(212, result2, "100 Celsius should be 212 Fahrenheit");

        double result3 = Conversions.celsiusToFahrenheit(-40);
        assertEquals(-40, result3, "-40 Celsius should be -40 Fahrenheit");
    }
}

 
