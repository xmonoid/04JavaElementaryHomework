package com.tsystems.autotestuni.basic;

/**
 * To practice with decimals.
 *
 * @author ekosykh
 */
public class Rectangle {

    /**
     * Implement calculation of the perimeter of a rectangle.
     * Expect that parameters are not negative.
     *
     * @param length rectangle's length
     * @param width rectangle's width
     * @return rectangle's perimeter
     */
    public static double perimeter(double length, double width) {
        return (length + width) * 2;
    }

    /**
     * Implement calculation of the area of a rectangle.
     * Expect that parameters are not negative.
     *
     * @param length rectangle's length
     * @param width rectangle's width
     * @return rectangle's area
     */
    public static double area(double length, double width) {
        return length * width;
    }
}
