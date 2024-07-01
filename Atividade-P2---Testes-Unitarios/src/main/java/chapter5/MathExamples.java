package chapter5;

import java.math.BigDecimal;

public class MathExamples {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int exponent(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static double addDouble(double a, double b) {
        return a + b;
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double exponent(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public static double absoluteVal(double a) {
        return Math.abs(a);
    }
}
