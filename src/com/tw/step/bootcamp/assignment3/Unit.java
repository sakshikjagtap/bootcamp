package com.tw.step.bootcamp.assignment3;

public class Unit {

    private final int feet;
    private final int oneFeet;

    public Unit(int feet) {
        this.feet=feet;
        this.oneFeet=12;
    }


    public boolean compare(int inches) {
        return  inches==feet*oneFeet;
    }
}
