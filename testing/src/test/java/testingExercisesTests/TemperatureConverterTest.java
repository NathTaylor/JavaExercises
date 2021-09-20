package testingExercisesTests;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import testingExercises.TemperatureConverter;

public class TemperatureConverterTest {

	TemperatureConverter tempCon = new TemperatureConverter();
	
	
	
	@BeforeClass
	public static void init() {
	    System.out.println("Before test");
	}
	
	@Test
	public void testConvertFahrenheitToCelsius() {
		assertEquals("Expected different outcome", 93.8889, tempCon.convertFahrenheitToCelsius(201), 0.1);
	}
	
		
	@Test
	public void testConvertCelsiusToFahrenheit() {
		assertEquals("Expected different outcome", 39.2, tempCon.convertCelsiusToFahrenheit(4), 0.1);
	}
	
	@Test
	public void testConvertKelvinToCelsius() {
		assertEquals("Expected Kelvin - 273",  5, tempCon.convertKelvinToCelsius(278), 0.1);
	}
	
	@Test
	public void testConvertCelsiusToKelvin() {
		assertEquals("Expected Celsius + 273", 296, tempCon.convertCelsiusToKelvin(23), 0.1);
	}
	
	@Test
	public void testConvertKelvinToFahrenheit() {
		assertEquals("Expected different outcome", -279.39, tempCon.convertKelvinToFahrenheit(100), 0.1);
	}
	
	@Test
	public void testConvertFahrenheitToKelvin() {
		assertEquals("Expected different outcome", -401.79, tempCon.convertKelvinToFahrenheit(32), 0.1);
	}
	
}
