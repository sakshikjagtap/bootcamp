package com.tw.step.bootcamp.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square square = new Square(2);
        double area = square.area();
        assertEquals(area,4);
    }

    @Test
    void perimeter() {
        Square square = new Square(2);
        double perimeter = square.perimeter();
        assertEquals(perimeter,8);
    }
}