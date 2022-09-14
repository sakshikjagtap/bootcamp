package com.tw.step.bootcamp.assignment1;

import com.tw.step.bootcamp.assignment1.exceptions.NegativeDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void areaOfRectangle() throws NegativeDimensionException {
        Rectangle rectangle = Rectangle.createRectangle(2, 2);
        double area = rectangle.area();
        assertEquals(4,area);


        Rectangle rectangle1 = Rectangle.createRectangle(2.1, 2.1);
        double area1 = rectangle1.area();
        assertEquals(4.41,area1);
    }

    @Test
    void perimeterOfRectangle() throws NegativeDimensionException {
        Rectangle rectangle = Rectangle.createRectangle(2, 2);
        double perimeter = rectangle.perimeter();
        assertEquals(8,perimeter);

        Rectangle rectangle1 = Rectangle.createRectangle(2.1, 2.1);
        double perimeter1 = rectangle1.perimeter();
        assertEquals(8.4,perimeter1);
    }

    @Test
    void areaOfSquare() {
        Rectangle square = Rectangle.createSquare(2);
        double area = square.area();
        assertEquals(4,area);
    }

    @Test
    void perimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(2.1);
        double perimeter = square.perimeter();
        assertEquals(8.4,perimeter);
    }

}