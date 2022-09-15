package com.tw.step.bootcamp.assignment3;

public class Inche {
    private final int inches;

    public Inche(int inches) {
        this.inches = inches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inche inche = (Inche) o;

        return inches == inche.inches;
    }

    @Override
    public int hashCode() {
        return inches;
    }
}
