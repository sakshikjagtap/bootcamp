package com.tw.step.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CmTest {

    @Test
    void getMM() {
        Cm cm = new Cm(1);
        assertEquals(10,cm.getMM());
    }
}