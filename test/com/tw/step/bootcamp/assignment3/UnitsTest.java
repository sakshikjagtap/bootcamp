package com.tw.step.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UnitsTest {

    @Test
    void shouldReturnZeroWhenBothLengthsAreEqual() {
        Feet feet = new Feet(1);
        Unit unit = new Unit(feet);
        Inch inch = new Inch(12);

        assertEquals(0,unit.compareTo(inch));
    }

    @Test
    void shouldReturnOneWhenFirstLengthIsGreaterThanSecondLength() {
        Feet feet = new Feet(3);
        Unit unit = new Unit(feet);
        Inch inch = new Inch(12);

        assertEquals(1,unit.compareTo(inch));
    }

    @Test
    void shouldReturnMinusOneWhenFirstLengthIsLessThanSecondLength() {
        Feet feet = new Feet(1);
        Unit unit = new Unit(feet);
        Inch inch = new Inch(13);

        assertEquals(-1,unit.compareTo(inch));
    }


}