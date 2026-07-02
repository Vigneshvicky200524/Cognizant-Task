package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {

        System.out.println("Test Started");

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2,3));

        System.out.println("Test Passed");
    }
}