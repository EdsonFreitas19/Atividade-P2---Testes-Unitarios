package chapter5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class MathExamplesTests {

    @Test
    public void testAddInt() {
        int result = MathExamples.add(5, 3);
        Printer.print("Test add: 5 + 3 = " + result);
        assertEquals(8, result);
    }

    @Test
    public void testSubtractInt() {
        int result = MathExamples.subtract(5, 3);
        Printer.print("Test subtract: 5 - 3 = " + result);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplyInt() {
        int result = MathExamples.multiply(5, 3);
        Printer.print("Test multiply: 5 * 3 = " + result);
        assertEquals(15, result);
    }

    @Test
    public void testDivideInt() {
        double result = MathExamples.divide(5, 3);
        Printer.print("Test divide: 5 / 3 = " + result);
        assertEquals(5.0 / 3.0, result, 0.0001);
    }

    @Test
    public void testModuloInt() {
        int result = MathExamples.modulo(5, 3);
        Printer.print("Test modulo: 5 % 3 = " + result);
        assertEquals(2, result);
    }

    @Test
    public void testExponentInt() {
        int result = MathExamples.exponent(2, 3);
        Printer.print("Test exponent: 2 ^ 3 = " + result);
        assertEquals(8, result);
    }

    @Test
    public void testAddDouble() {
        double result = MathExamples.addDouble(0.1, 0.2);
        Printer.print("Test addDouble: 0.1 + 0.2 = " + result);
        assertEquals(0.3, result, 0.0001);
    }

    @Test
    public void testSubtractDouble() {
        double result = MathExamples.subtract(5.2, 3.1);
        Printer.print("Test subtract: 5.2 - 3.1 = " + result);
        assertEquals(2.1, result, 0.0001);
    }

    @Test
    public void testMultiplyDouble() {
        double result = MathExamples.multiply(5.2, 3.1);
        Printer.print("Test multiply: 5.2 * 3.1 = " + result);
        assertEquals(5.2 * 3.1, result, 0.0001);
    }

    @Test
    public void testDivideDouble() {
        double result = MathExamples.divide(5.2, 3.1);
        Printer.print("Test divide: 5.2 / 3.1 = " + result);
        assertEquals(5.2 / 3.1, result, 0.0001);
    }

    @Test
    public void testExponentDouble() {
        double result = MathExamples.exponent(5.2, 3.1);
        Printer.print("Test exponent: 5.2 ^ 3.1 = " + result);
        assertEquals(Math.pow(5.2, 3.1), result, 0.0001);
    }

    @Test
    public void testSquareRoot() {
        double result = MathExamples.squareRoot(4.0);
        Printer.print("Test squareRoot: sqrt(4.0) = " + result);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testAbsoluteVal() {
        double result = MathExamples.absoluteVal(-4.0);
        Printer.print("Test absoluteVal: abs(-4.0) = " + result);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testAddBigDecimal() {
        BigDecimal bdNumE = new BigDecimal(0.1).setScale(1, BigDecimal.ROUND_HALF_UP);
        BigDecimal bdNumF = new BigDecimal(0.2).setScale(1, BigDecimal.ROUND_HALF_UP);
        BigDecimal result = MathExamples.add(bdNumE, bdNumF);
        Printer.print("Test add BigDecimal: " + bdNumE + " + " + bdNumF + " = " + result);
        assertEquals(new BigDecimal(0.3).setScale(1, BigDecimal.ROUND_HALF_UP), result);
    }
}
