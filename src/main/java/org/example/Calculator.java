package org.example;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double substract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a/b;
    }

    static double squareRoot(double a) throws NegativeNumberError {
        if (a < 0) {
            throw new NegativeNumberError("Die Quadratwurzel einer negativen Zahl ist nicht definiert!");
        } else {
            return Math.sqrt(a);
        }
    }

    static double power(double a, int b) {
        return Math.pow(a, b);
    }

}
