package com.tw.step.bootcamp.assignment1;

public class Rectangle implements Shapes {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length * this.breadth ;
    }

    @Override
    public double perimeter() {
        return 2*(this.length+this.breadth);
    }
}
