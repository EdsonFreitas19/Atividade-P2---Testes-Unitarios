package chapter5;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        int intNumA = 5;
        int intNumB = 3;
        double dblNumC = 5.2d;
        double dblNumD = 3.1d;
        double dblNumE = 0.1d;
        double dblNumF = 0.2d;
        
        Printer.print(intNumA + " + " + intNumB + " = " + MathExamples.add(intNumA, intNumB));
        Printer.print(intNumA + " - " + intNumB + " = " + MathExamples.subtract(intNumA, intNumB));
        Printer.print(intNumA + " x " + intNumB + " = " + MathExamples.multiply(intNumA, intNumB));
        Printer.print(intNumA + " " + (char) 247 + " " + intNumB + " = " + MathExamples.divide(intNumA, intNumB));
        Printer.print(intNumA + " mod " + intNumB + " = " + MathExamples.modulo(intNumA, intNumB));
        Printer.print(intNumA + " to the power of " + intNumB + " = " + MathExamples.exponent(intNumA, intNumB));
        Printer.print(dblNumC + " + " + dblNumD + " = " + MathExamples.addDouble(dblNumC, dblNumD));
        Printer.print(dblNumE + " + " + dblNumF + " = " + MathExamples.addDouble(dblNumE, dblNumF));
        Printer.print(String.valueOf(0.1f == 0.1d));
        
        dblNumE = 0.1f;
        dblNumF = 0.2f;
        Printer.print(dblNumE + " + " + dblNumF + " = " + MathExamples.addDouble(dblNumE, dblNumF));
        
        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal(0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal(0.2).setScale(1, rmHalfUp);
        Printer.print(bdNumE + " + " + bdNumF + " = " + MathExamples.add(bdNumE, bdNumF));
        
        Printer.print(dblNumC + " - " + dblNumD + " = " + MathExamples.subtract(dblNumC, dblNumD));
        Printer.print(dblNumC + " x " + dblNumD + " = " + MathExamples.multiply(dblNumC, dblNumD));
        Printer.print(dblNumC + " " + (char) 247 + " " + dblNumD + " = " + MathExamples.divide(dblNumC, dblNumD));
        
        Printer.print(String.format("%1.3f " + (char) 247 + " %1.3f = %1.3f", dblNumC, dblNumD, MathExamples.divide(dblNumC, dblNumD)));
        Printer.print(String.format("%1.1f " + (char) 247 + "%1.1f = %1.3f", dblNumC, dblNumD, MathExamples.divide(dblNumC, dblNumD)));
        
        DecimalFormat dFormat = new DecimalFormat("#,###.###");
        Printer.print(dblNumC + " " + (char) 247 + " " + dblNumD + " = " + dFormat.format(MathExamples.divide(dblNumC, dblNumD)));
        Printer.print(dblNumC + " to the power of " + dblNumD + " = " + dFormat.format(MathExamples.exponent(dblNumC, dblNumD)));
        Printer.print("The square root of " + dblNumC + " = " + dFormat.format(MathExamples.squareRoot(dblNumC)));
        Printer.print("The absolute value of " + dblNumC + " = " + dFormat.format(MathExamples.absoluteVal(dblNumC)));
        
        double dblNumG = -9f;
        Printer.print("The absolute value of " + dblNumG + " = " + dFormat.format(MathExamples.absoluteVal(dblNumG)));
    }
}
