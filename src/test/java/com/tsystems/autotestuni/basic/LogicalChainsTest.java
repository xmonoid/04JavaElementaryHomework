package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalChainsTest {

    @Test
    void between5and50() {
        assertFalse(LogicalChains.between5and50(3));
        assertTrue(LogicalChains.between5and50(20));
        assertFalse(LogicalChains.between5and50(60));
    }

    @Test
    void beyond5and50() {
        assertTrue(LogicalChains.beyond5and50(-5));
        assertFalse(LogicalChains.beyond5and50(10));
        assertTrue(LogicalChains.beyond5and50(100));
    }

    @Test
    void betweenOneOfTwoIntervals() {
        assertFalse(LogicalChains.betweenOneOfTwoIntervals(-60));
        assertTrue(LogicalChains.betweenOneOfTwoIntervals(-35));
        assertFalse(LogicalChains.betweenOneOfTwoIntervals(0));
        assertTrue(LogicalChains.betweenOneOfTwoIntervals(35));
        assertFalse(LogicalChains.betweenOneOfTwoIntervals(60));
    }
}