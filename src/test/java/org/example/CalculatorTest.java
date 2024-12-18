package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private static final double DELTA = 1e-9;

    @Test
    public void testAdd() {
        assertEquals(30.0, Calculator.add(10.0, 20.0));
    }

    @Test
    public void testSubtract() {
        assertEquals(-50.0, Calculator.substract(50.0, 100.0));
    }

    @Test
    public void testMultiply() {
        assertEquals(200.0, Calculator.multiply(10.0, 20.0));
    }

    @Test
    public void testMultiplyNeg() {
        assertEquals(-200.0, Calculator.multiply(10.0, -20.0));
        assertEquals(200.0, Calculator.multiply(-10.0, -20.0));
    }

    @Test
    public void testDivide(){
        assertEquals(5.0, Calculator.divide(25.0, 5.0));
    }

    @Test
    public void testDivideNeg(){
        assertEquals(-3.0, Calculator.divide(-9.0, 3.0));
        assertEquals(-3.0, Calculator.divide(9.0, -3.0));
    }

    @Test
    public void testDivideWithNull(){
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10.0, 0.0));
    }

    @Test
    public void testSquareRoot() throws NegativeNumberError {
        assertEquals(3.464101615, Calculator.squareRoot(12.0), DELTA);
        assertEquals(4.0, Calculator.squareRoot(16.0));
        assertEquals(0.0, Calculator.squareRoot(0.0));
    }

    @Test
    public void testSquareRootNeg() {
        assertThrows(NegativeNumberError.class, () -> Calculator.squareRoot(-12.0));
    }

    @Test
    public void testPow() {
        assertEquals(81.0, Calculator.power(3.0, 4));
    }
}
