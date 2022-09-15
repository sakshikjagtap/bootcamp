package com.tw.step.bootcamp.assignment2;

import com.tw.step.bootcamp.assignment2.exceptions.OutOfProbability;

public class Probability {

    private final double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability createChance(double probability) throws OutOfProbability {
        if (probability >= 0 && probability <= 1) {
            return new Probability(probability);
        }
        throw new OutOfProbability("Probability should be between 0 and 1");
    }

    public Probability complement() throws OutOfProbability {
        return Probability.createChance(1 - probability);
    }

    public Probability atLeastOneChance(Probability anotherProbability) throws OutOfProbability {
        Probability probability1 = this.combine(anotherProbability);
        Probability complement = probability1.complement();

        return Probability.createChance(1 );
    }

    public Probability combine(Probability anotherProbability) throws OutOfProbability {
        return Probability.createChance(anotherProbability.probability * this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Probability{" +
                "probability=" + probability +
                '}';
    }
}
