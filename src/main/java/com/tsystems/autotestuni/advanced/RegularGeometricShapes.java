package com.tsystems.autotestuni.advanced;

public class RegularGeometricShapes {

    /**
     * Implement calculation of the area of a regular hexagon.
     *
     * The method must return {@code Double.NaN} in case of negative parameters.
     *
     * @param length the length of sides
     * @return the area of the hexagon
     */
    public static double hexagonArea(double length) {
        if (length < 0.0) {
            return Double.NaN;
        }
        if (length == 0.0) {
            return 0.0;
        }
        return 3 * Math.sqrt(3) / 2.0 * Math.pow(length, 2);
    }

    /**
     * Implement calculation of the area of a regular polygon.
     *
     * The method must return {@code Double.NaN} in case of negative parameters.
     * Remember that the number of sides cannot be less than 3.
     *
     * @param sides the number of sides
     * @param length the length of sides
     * @return the area of the polygon
     */
    public static double polygonArea(int sides, double length) {
        if (sides < 3 || length < 0.0) {
            return Double.NaN;
        }
        if (length == 0.0) {
            return 0.0;
        }
        return 1.0/4.0 * sides * Math.pow(length, 2) / Math.tan(Math.PI / sides);
    }
}
