package org.petrova.project.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class TestCalculation {
    @Test
    void testCalculation1() {
        var inputData = List.of(1, 2, 3, 4, 5);
        var result = AbstractCalculation.calculateAnalytics(inputData);

        Assertions.assertEquals(result.getCount(), 5);
        Assertions.assertEquals(result.getSum(), 15);
        Assertions.assertEquals(result.getMin(), 1);
        Assertions.assertEquals(result.getMax(), 5);
        Assertions.assertEquals(result.getOdd(), 3);
        Assertions.assertEquals(result.getEven(), 2);
        Assertions.assertEquals(result.getSumeven(), 6);
        Assertions.assertEquals(result.getSumodd(), 9);
        Assertions.assertEquals(result.getAllMultiples(), 120);
    }

    @Test
    void testCalculation2() {
        var inputData = List.of(-1, 2, -3);
        var result = AbstractCalculation.calculateAnalytics(inputData);

        Assertions.assertEquals(result.getCount(), 3);
        Assertions.assertEquals(result.getSum(), -2);
        Assertions.assertEquals(result.getMin(), -3);
        Assertions.assertEquals(result.getMax(), 2);
        Assertions.assertEquals(result.getOdd(), 2);
        Assertions.assertEquals(result.getEven(), 1);
        Assertions.assertEquals(result.getSumeven(), 2);
        Assertions.assertEquals(result.getSumodd(), -4);
        Assertions.assertEquals(result.getAllMultiples(), 6);
    }

    @Test
    void testCalculation3() {
        var inputData = List.of(1);
        var result = AbstractCalculation.calculateAnalytics(inputData);

        Assertions.assertEquals(result.getCount(), 1);
        Assertions.assertEquals(result.getSum(), 1);
        Assertions.assertEquals(result.getMin(), 1);
        Assertions.assertEquals(result.getMax(), 1);
        Assertions.assertEquals(result.getOdd(), 1);
        Assertions.assertEquals(result.getEven(), 0);
        Assertions.assertEquals(result.getSumeven(), 0);
        Assertions.assertEquals(result.getSumodd(), 1);
        Assertions.assertEquals(result.getAllMultiples(), 1);
    }

    @Test
    void testCalculation4() {
        var inputData = List.of(0, 1, 2);
        var result = AbstractCalculation.calculateAnalytics(inputData);

        Assertions.assertEquals(result.getCount(), 3);
        Assertions.assertEquals(result.getSum(), 3);
        Assertions.assertEquals(result.getMin(), 0);
        Assertions.assertEquals(result.getMax(), 2);
        Assertions.assertEquals(result.getOdd(), 1);
        Assertions.assertEquals(result.getEven(), 2);
        Assertions.assertEquals(result.getSumeven(), 2);
        Assertions.assertEquals(result.getSumodd(), 1);
        Assertions.assertEquals(result.getAllMultiples(), 0);
    }

    @Test
    void testCalculation5() {
        var inputData = List.of(-10, -20, -30);
        var result = AbstractCalculation.calculateAnalytics(inputData);

        Assertions.assertEquals(result.getCount(), 3);
        Assertions.assertEquals(result.getSum(), -60);
        Assertions.assertEquals(result.getMin(), -30);
        Assertions.assertEquals(result.getMax(), -10);
        Assertions.assertEquals(result.getOdd(), 0);
        Assertions.assertEquals(result.getEven(), 3);
        Assertions.assertEquals(result.getSumeven(), -60);
        Assertions.assertEquals(result.getSumodd(), 0);
        Assertions.assertEquals(result.getAllMultiples(), -6000);
    }

    @Test
    void testCalculationEmptyValues() {
        Assertions.assertThrows(NoSuchElementException.class, () -> AbstractCalculation.calculateAnalytics(List.of()));
    }
}