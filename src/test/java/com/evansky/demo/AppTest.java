package com.evansky.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for App
 */
public class AppTest {
    
    private App app;
    
    @BeforeEach
    public void setup() {
        app = new App();
    }
    
    @Test
    public void testGreet() {
        String result = app.greet("World");
        assertNotNull(result);
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, app.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-10, app.add(-7, -3), "-7 + -3 should equal -10");
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, app.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(-2, app.subtract(3, 5), "3 - 5 should equal -2");
        assertEquals(0, app.subtract(0, 0), "0 - 0 should equal 0");
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6, app.multiply(2, 3), "2 × 3 should equal 6");
        assertEquals(-6, app.multiply(2, -3), "2 × -3 should equal -6");
        assertEquals(0, app.multiply(0, 5), "0 × 5 should equal 0");
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.5, app.divide(5, 2), "5 ÷ 2 should equal 2.5");
        assertEquals(0.0, app.divide(0, 5), "0 ÷ 5 should equal 0");
        assertEquals(-2.0, app.divide(10, -5), "10 ÷ -5 should equal -2");
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> app.divide(5, 0),
                "Dividing by zero should throw ArithmeticException");
    }
}