package chapter5;

import java.math.BigDecimal;

public class MathExamples {
    public static int add(int intNum1, int intNum2) {
        return intNum1 + intNum2;
    }

    public static int subtract(int intNum1, int intNum2) {
        return intNum1 - intNum2;
    }

    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }

    public static int divide(int intDividendo, int intDivisor) {
        return intDividendo / intDivisor;
    }

    public static int modulo(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }

    public static int exponent(int base, int power) {
        return (int) Math.pow(base, power);
    }

    public static double addDouble(double dblNumC, double dblNumD) {
        return dblNumC + dblNumD;
    }

    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {
        return bdNum1.add(bdNum2);
    }

    public static double subtract(double dblNum1, double dblNum2) {
        return dblNum1 - dblNum2;
    }

    public static double multiply(double dblNum1, double dblNum2) {
        return dblNum1 * dblNum2;
    }

    public static double divide(double dblNum1, double dblNum2) {
        return dblNum1 / dblNum2;
    }

    public static double exponent(double base, double power) {
        return Math.pow(base, power);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double cubeRoot(double number) {
        return Math.cbrt(number);
    }

    public static double absoluteVal(double number) {
        return Math.abs(number);
    }



}
