package com.tw.step.bootcamp.assignment3;

public class Feet implements Length {
    private final int feet;

    public Feet(int feet) {
        this.feet = feet;
    }

    @Override
    public double getMM() {
        return this.feet*304.8;
    }

}
