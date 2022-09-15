package com.tw.step.bootcamp.assignment3;

public class Cm implements Length {

    private final double cm;

    public Cm(double cm) {
        this.cm=cm;
    }

    @Override
    public double getMM() {
        return this.cm*10;
    }
}
