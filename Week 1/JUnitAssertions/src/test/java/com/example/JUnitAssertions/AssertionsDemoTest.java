package com.example.JUnitAssertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsDemoTest {

    AssertionsDemo demo = new AssertionsDemo();

    @Test
    void testSquare() {
        int result = demo.square(5);
        System.out.println("Square of 5 = " + result);
        assertEquals(25, result);
    }

    @Test
    void testPositive() {
        System.out.println("Checking positive number...");
        assertTrue(demo.isPositive(10));
    }

    @Test
    void testNegative() {
        System.out.println("Checking negative number...");
        assertFalse(demo.isPositive(-5));
    }

    @Test
    void testMessage() {
        System.out.println("Message = " + demo.getMessage());
        assertNotNull(demo.getMessage());
    }

    @Test
    void testNull() {
        System.out.println("Checking null value...");
        assertNull(demo.getNullValue());
    }
}