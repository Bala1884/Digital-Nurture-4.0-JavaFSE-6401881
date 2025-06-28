package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: New Calculator instance created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator instance cleared");
    }

    @Test
    public void testAdd() {

        int result = calculator.add(10, 5);


        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {

        int result = calculator.subtract(10, 4);

        assertEquals(6, result);
    }
}
