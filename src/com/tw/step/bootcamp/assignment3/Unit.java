package com.tw.step.bootcamp.assignment3;

public class Unit {

    private final Length length;

    public Unit(Length length) {
        this.length = length;
    }

    public int compareTo(Length anotherLength) {

        if (this.isApprox(anotherLength)) {
            return 0;
        }
        if (length.getMM() < anotherLength.getMM()) {
            return -1;
        }
        return 1;
    }

    private boolean isApprox(Length anotherLength) {
        return Math.abs(length.getMM() - anotherLength.getMM()) < 0.3;
    }
}
