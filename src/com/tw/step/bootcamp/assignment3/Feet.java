package com.tw.step.bootcamp.assignment3;

public class Feet {
    private final int feet;

    public Feet(int feet) {
        this.feet = feet;
    }

    public double getInInches(){
        return this.feet*12;
    }
}
