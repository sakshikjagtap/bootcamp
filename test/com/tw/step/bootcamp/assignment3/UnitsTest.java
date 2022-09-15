package com.tw.step.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UnitsTest {

    @Test
    void shouldReturnTrue() {
        Unit unit = new Unit(1);


        assertTrue(unit.compare(12));

    }
}