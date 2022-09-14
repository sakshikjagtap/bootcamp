package com.tw.step.bootcamp.assignment1;

public class Square implements Shapes{

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return 4 *this.side;
    }
}
