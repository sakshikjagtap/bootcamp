package com.tw.step.bootcamp.assignment1;

import com.tw.step.bootcamp.assignment1.exceptions.NegativeDimensionException;

public class Rectangle implements Shapes {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle(side,side);
    }
    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }

    public static Rectangle createRectangle(double length, double breadth) throws NegativeDimensionException {
        if (length <= 0 || breadth <= 0 ){
            throw new NegativeDimensionException("Dimension should be greater than 0");
        }
        return new Rectangle(length, breadth);
    }
}
