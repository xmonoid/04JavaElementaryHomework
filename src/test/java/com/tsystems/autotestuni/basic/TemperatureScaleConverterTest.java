package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureScaleConverterTest {

    @Test
    void fahrenheitToCelsius() {
        assertEquals(-17.777, TemperatureScaleConverter.fahrenheitToCelsius(0.0), 0.001);
        assertEquals(0.0, TemperatureScaleConverter.fahrenheitToCelsius(32.0));
        assertEquals(10.0, TemperatureScaleConverter.fahrenheitToCelsius(50.0));
        assertEquals(100.0, TemperatureScaleConverter.fahrenheitToCelsius(212.0));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(1.399, TemperatureScaleConverter.celsiusToFahrenheit(-17.0), 0.001);
        assertEquals(32.0, TemperatureScaleConverter.celsiusToFahrenheit(0.0));
        assertEquals(50.0, TemperatureScaleConverter.celsiusToFahrenheit(10.0));
        assertEquals(212, TemperatureScaleConverter.celsiusToFahrenheit(100.0));
    }
}