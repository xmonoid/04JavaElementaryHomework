package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterArithmeticTest {

    @Test
    void checkSymbolIsDigit() {
        for (char c = '0'; c <= '9'; c++) {
            assertTrue(CharacterArithmetic.checkSymbolIsDigit(c));
        }
        assertFalse(CharacterArithmetic.checkSymbolIsDigit('a'));
        assertFalse(CharacterArithmetic.checkSymbolIsDigit('ы'));
    }

    @Test
    void checkSymbolIsLatinLetter() {
        for (char c = 'A'; c <= 'Z'; c++) {
            assertTrue(CharacterArithmetic.checkSymbolIsLatinLetter(c));
        }
        for (char c = 'a'; c <= 'z'; c++) {
            assertTrue(CharacterArithmetic.checkSymbolIsLatinLetter(c));
        }
        assertFalse(CharacterArithmetic.checkSymbolIsLatinLetter('1'));
        assertFalse(CharacterArithmetic.checkSymbolIsLatinLetter('ы'));
    }
}