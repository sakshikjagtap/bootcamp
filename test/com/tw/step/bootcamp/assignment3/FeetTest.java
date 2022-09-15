package com.tw.step.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

    @Test
    void getMM() {
        Feet feet = new Feet(1);
        assertEquals(304.8,feet.getMM());
    }
}