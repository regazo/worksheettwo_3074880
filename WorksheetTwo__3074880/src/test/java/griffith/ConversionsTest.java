package griffith;
//zakarea erezzaghi 3074880

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionsTest {

    // Unit test for celsiusToFahrenheit method
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals("0 Celsius should be 32 Fahrenheit", 32.0, Conversions.celsiusToFahrenheit(0), 0.001);
        assertEquals("100 Celsius should be 212 Fahrenheit", 212.0, Conversions.celsiusToFahrenheit(100), 0.001);
        assertEquals("-40 Celsius should be -40 Fahrenheit", -40.0, Conversions.celsiusToFahrenheit(-40), 0.001);
    }

//Unit test for fahrenheitToCelsius method
@Test
public void testFahrenheitToCelsius() {
    assertEquals("32 Fahrenheit should be 0 Celsius", 0.0, Conversions.fahrenheitToCelsius(32), 0.001);
    assertEquals("212 Fahrenheit should be 100 Celsius", 100.0, Conversions.fahrenheitToCelsius(212), 0.001);
    assertEquals("-40 Fahrenheit should be -40 Celsius", -40.0, Conversions.fahrenheitToCelsius(-40), 0.001);
}
    