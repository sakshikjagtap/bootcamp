package com.tw.step.bootcamp.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(2, 2);
        double area1 = rectangle.area();
        assertEquals(4,area1);
    }
    void areaofDouble() {
        Rectangle rectangle = new Rectangle(2.1, 2.1);
        double area1 = rectangle.area();
        assertEquals(4.2,area1);
    }
}