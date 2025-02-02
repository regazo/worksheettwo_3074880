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
// Unit test for milesToKilometer method
@Test
public void testMilesToKilometer() {
    assertEquals("1 mile should be approximately 1.60934 kilometers", 1.60934, Conversions.milesToKilometer(1), 0.001);
    assertEquals("5 miles should be approximately 8.0467 kilometers", 8.0467, Conversions.milesToKilometer(5), 0.001);
    assertEquals("0 miles should be 0 kilometers", 0.0, Conversions.milesToKilometer(0), 0.001);
}
// Unit test for kilometerToMiles method
@Test
public void testKilometerToMiles() {
    assertEquals("1 kilometer should be approximately 0.621371 miles", 0.621371, Conversions.kilometerToMiles(1), 0.001);
    assertEquals("10 kilometers should be approximately 6.21371 miles", 6.21371, Conversions.kilometerToMiles(10), 0.001);
    assertEquals("0 kilometers should be 0 miles", 0.0, Conversions.kilometerToMiles(0), 0.001);
}
//Unit test for upperCaseToLowerCase method
@Test
public void testUpperCaseToLowerCase() {
    assertEquals("Convert HELLO to hello", "hello", Conversions.upperCaseToLowerCase("HELLO"));
    assertEquals("Convert WORLD to world", "world", Conversions.upperCaseToLowerCase("WORLD"));
    assertEquals("Convert 123 to 123", "123", Conversions.upperCaseToLowerCase("123"));
}
// Unit test for lowerCaseToUpperCase method
@Test
public void testLowerCaseToUpperCase() {
    assertEquals("Convert hello to HELLO", "HELLO", Conversions.lowerCaseToUpperCase("hello"));
    assertEquals("Convert world to WORLD", "WORLD", Conversions.lowerCaseToUpperCase("world"));
    assertEquals("Convert 123 to 123", "123", Conversions.lowerCaseToUpperCase("123"));
}
}

    