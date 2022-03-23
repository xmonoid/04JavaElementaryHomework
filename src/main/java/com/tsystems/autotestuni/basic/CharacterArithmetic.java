package com.tsystems.autotestuni.basic;

/**
 * To practice with characters and inequalities.
 *
 * @author ekosykh
 */
public class CharacterArithmetic {

    /**
     * Check that the input symbols is a decimal digit.
     *
     * @param symbol input symbol
     * @return {@code true} if the symbol is a digit, {@code false} otherwise
     */
    public static boolean checkSymbolIsDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    /**
     * Check that the input symbols is a latin letter in upper or lower case.
     *
     * @param symbol input symbol
     * @return {@code true} if the symbol is a latin letter, {@code false} otherwise
     */
    public static boolean checkSymbolIsLatinLetter(char symbol) {
        return symbol >= 'A' && symbol<= 'Z' || symbol >= 'a' && symbol <= 'z';
    }
}
