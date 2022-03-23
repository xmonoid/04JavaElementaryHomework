package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeterTest() {
        assertEquals(0.0, Rectangle.perimeter(0, 0));
        assertEquals(2.0, Rectangle.perimeter(1, 0));
        assertEquals(2.0, Rectangle.perimeter(0, 1));
        assertEquals(4.0, Rectangle.perimeter(1, 1));
        assertEquals(11.719748964097676, Rectangle.perimeter(Math.PI, Math.E));
    }

    @Test
    void area() {
        assertEquals(0.0, Rectangle.area(0, 0));
        assertEquals(0.0, Rectangle.area(1, 0));
        assertEquals(0.0, Rectangle.area(0, 1));
        assertEquals(1.0, Rectangle.area(1, 1));
        assertEquals(8.539734222673566, Rectangle.area(Math.PI, Math.E));
    }
}