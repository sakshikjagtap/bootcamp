package com.tw.step.bootcamp.assignment3;

public class Inch implements Length {
    private final int inches;

    public Inch(int inches) {
        this.inches = inches;
    }

    @Override
    public double getMM() {
        return this.inches * 25.4;
    }

}
