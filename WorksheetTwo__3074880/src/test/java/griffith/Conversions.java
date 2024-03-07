package griffith;
//zakarea erezzaghi 3074880
public class Conversions {

	    // Method that converts Celsius to Fahrenheit
	    public double celsiusToFahrenheit(double celsius) {
	        // Implement conversion logic from Celsius to Fahrenheit
	        return (celsius * 9 / 5) + 32;
	    }

	    // Method that converts Fahrenheit to Celsius
	    public double fahrenheitToCelsius(double fahrenheit) {
	        // Implement conversion logic from Fahrenheit to Celsius
	        return (fahrenheit - 32) * 5 / 9;
	    }

	    // Method that converts miles to kilometers
	    public double milesToKilometer(double miles) {
	        // Implement conversion logic from miles to kilometers
	        return miles * 1.60934;
	    }

	    // Method that converts kilometers to miles
	    public double kilometerToMiles(double kilometers) {
	        // Implement conversion logic from kilometers to miles
	        return kilometers * 0.62137;
	    }

	    // Method that converts uppercase letters to lowercase letters
	    public String upperCaseToLowerCase(String input) {
	        // Implement conversion logic to convert uppercase letters to lowercase letters
	        return input.toLowerCase();
	    }

	    // Method that converts lowercase letters to uppercase letters
	    public String lowerCaseToUpperCase(String input) {
	        // Implement conversion logic to convert lowercase letters to uppercase letters
	        return input.toUpperCase();
	    }
	}

	