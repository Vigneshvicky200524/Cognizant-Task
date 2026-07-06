package com.example.JUnitAAAProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

    private ArithmeticOperations arithmetic;

    @BeforeAll
    static void beforeAll() {
        System.out.println("===== Testing Started =====");
    }

    @BeforeEach
    void setUp() {
        arithmetic = new ArithmeticOperations();
        System.out.println("Setup Executed");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = arithmetic.add(a, b);

        // Assert
        assertEquals(30, result);

        System.out.println("Addition Test Passed");
    }

    @Test
    void testSubtraction() {

        // Arrange
        int a = 50;
        int b = 20;

        // Act
        int result = arithmetic.subtract(a, b);

        // Assert
        assertEquals(30, result);

        System.out.println("Subtraction Test Passed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleanup Done");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("===== Testing Finished =====");
    }
}