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
    @Test
    void areaOfDouble() {
        Rectangle rectangle = new Rectangle(2.1, 2.1);
        double area1 = rectangle.area();
        assertEquals(4.41,area1);
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(2, 2);
        double perimeter = rectangle.perimeter();
        assertEquals(perimeter,8);
    }

    @Test
    void perimeterOfRectangleWithDoubleValues() {
        Rectangle rectangle = new Rectangle(2.1, 2.1);
        double perimeter = rectangle.perimeter();
        assertEquals(perimeter,8.4);
    }
}