package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularGeometricShapesTest {

    @Test
    void hexagonArea() {
        assertTrue(Double.isNaN(RegularGeometricShapes.hexagonArea(-1.0)));
        assertTrue(Double.isNaN(RegularGeometricShapes.hexagonArea(Double.NEGATIVE_INFINITY)));
        assertTrue(Double.isNaN(RegularGeometricShapes.hexagonArea(Double.NaN)));
        assertEquals(0.0, RegularGeometricShapes.hexagonArea(0.0));
        assertEquals(2.598076211353316, RegularGeometricShapes.hexagonArea(1.0));
        assertEquals(25.641984409938253, RegularGeometricShapes.hexagonArea(Math.PI));
        assertEquals(Double.POSITIVE_INFINITY, RegularGeometricShapes.hexagonArea(Double.POSITIVE_INFINITY));
    }

    @Test
    void polygonArea() {
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(-1, 0.0)));
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(1, 2.0)));
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(2, 2.0)));
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(3, -2.0)));
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(3, Double.NaN)));
        assertTrue(Double.isNaN(RegularGeometricShapes.polygonArea(3, Double.NEGATIVE_INFINITY)));
        assertEquals(0.0, RegularGeometricShapes.polygonArea(3, 0.0));
        assertEquals(0.43301270189221946, RegularGeometricShapes.polygonArea(3, 1.0));
        assertEquals(2.598076211353316, RegularGeometricShapes.polygonArea(6, 1.0));
        assertEquals(25.641984409938253, RegularGeometricShapes.polygonArea(6, Math.PI));
        assertEquals(906.8883462392372, RegularGeometricShapes.polygonArea(12, 9.0));
        assertEquals(Double.POSITIVE_INFINITY, RegularGeometricShapes.polygonArea(Integer.MAX_VALUE,
                Double.POSITIVE_INFINITY));
    }
}