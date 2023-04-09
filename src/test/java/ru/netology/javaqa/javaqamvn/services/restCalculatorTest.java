package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class restCalculatorTest {
    @Test
    public void test() {
        restCalculator service = new restCalculator();

        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}