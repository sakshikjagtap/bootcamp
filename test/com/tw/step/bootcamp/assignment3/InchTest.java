package com.tw.step.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

    @Test
    void getMM() {
        Inch inch = new Inch(1);
        assertEquals(25.4,inch.getMM());
    }
}