package com.tsystems.autotestuni.basic;

/**
 * To practice with decimals.
 *
 * @author ekosykh
 */
public final class TemperatureScaleConverter {

    /**
     * Convert temperature from Fahrenheit to Celsius scale.
     *
     * @param fahrenheit temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    /**
     * Convert temperature from Celsius to Fahrenheit scale.
     *
     * @param celsius temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
}
