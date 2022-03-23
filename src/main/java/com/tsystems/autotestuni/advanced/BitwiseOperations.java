package com.tsystems.autotestuni.advanced;

public class BitwiseOperations {

    /**
     * Check that the fifth bit of the provided number equals 1.
     *
     * @param number provided integer
     * @return {@code true} is the 5th bit is 1, {@code false} otherwise
     */
    public static boolean checkFifthBitIs1(int number) {
        return ((number & 0b0001_0000) / 0b0001_0000) == 1;
    }

    /**
     * Set the last 6 bits of the provided number to 0.
     *
     * @param number provided integer
     * @return the last 6 bits were set to 0, other bits should not be changed
     */
    public static int setLast6BitsTo0(int number) {
        return number & ~0b11_1111;
    }
}
