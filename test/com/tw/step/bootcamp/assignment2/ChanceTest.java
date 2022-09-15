package com.tw.step.bootcamp.assignment2;

import com.tw.step.bootcamp.assignment2.exceptions.OutOfProbability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

    @Test
    void complementOfChance() throws OutOfProbability {
        Probability probability = Probability.createChance(0.6);
        Probability expected = Probability.createChance(0.4);

        assertEquals(expected, probability.complement());
    }

    @Test
    void shouldCombineProbabilities() throws OutOfProbability {
        Probability probability1 = Probability.createChance(0.6);
        Probability probability2 = Probability.createChance(0.2);

        Probability expected= Probability.createChance(0.12);
        Probability combined = probability1.combine(probability2);

        assertEquals(expected,combined);
    }

    @Test
    void atleastOneChance() {

    }
}