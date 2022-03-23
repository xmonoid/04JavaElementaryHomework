package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseOperationsTest {

    @Test
    void checkFifthBitIs1() {
        assertFalse(BitwiseOperations.checkFifthBitIs1(0));
        assertFalse(BitwiseOperations.checkFifthBitIs1(-17));
        assertFalse(BitwiseOperations.checkFifthBitIs1(73_294_885));
        assertTrue(BitwiseOperations.checkFifthBitIs1(-1));
        assertTrue(BitwiseOperations.checkFifthBitIs1(16));
        assertTrue(BitwiseOperations.checkFifthBitIs1(73_294_901));
    }

    @Test
    void setLast6BitsTo0() {
        assertEquals(0, BitwiseOperations.setLast6BitsTo0(0));
        assertEquals(-64, BitwiseOperations.setLast6BitsTo0(-1));
        assertEquals(2_098_496, BitwiseOperations.setLast6BitsTo0(2_098_555));
    }
}