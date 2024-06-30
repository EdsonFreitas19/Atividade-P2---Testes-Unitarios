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
        System.out.println(intNumA + " + " + intNumB + " = " + MathExamples.add(intNumA,intNumB));
        System.out.println(intNumA + " - " + intNumB + " = " + MathExamples.subtract(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = " + MathExamples.multiply(intNumA,intNumB));
        System.out.println(intNumA + " " + (char)247 + " " + intNumB + " = " + MathExamples. divide(intNumA,intNumB));
        System.out.println(intNumA + " mod " + intNumB + " = " + MathExamples.modulo(intNumA, intNumB));
        System.out.println(intNumA + " to the power of " + intNumB + " = " + MathExamples.exponent(intNumA, intNumB));
        System.out.println(dblNumC + " + " + dblNumD + " = " + MathExamples.addDouble(dblNumC,dblNumD));
        System.out.println(dblNumE + " + " + dblNumF + " = " + MathExamples.addDouble(dblNumE,dblNumF));
        System.out.println((0.1f == 0.1d));
        dblNumE = 0.1f;
        dblNumF = 0.2f;
        System.out.println(dblNumE + " + " + dblNumF + " = " + MathExamples.addDouble(dblNumE,dblNumF));
        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (0.2).setScale(1, rmHalfUp);
        System.out.println(bdNumE + " + " + bdNumF + " = "+ MathExamples.add(bdNumE, bdNumF));
        System.out.println(dblNumC + " - " + dblNumD + " = " + MathExamples.subtract(dblNumC,dblNumD));
        System.out.println(dblNumC + " x " + dblNumD + " = " + MathExamples.multiply(dblNumC,dblNumD));
        System.out.println(dblNumC + " " + (char)247 + " " + dblNumD + " = " + MathExamples.divide(dblNumC, dblNumD));
        System.out.printf("%1.3f " + (char) 247 + " %1.3f = %1.3f \n", dblNumC, dblNumD, MathExamples.divide(dblNumC, dblNumD));
        System.out.printf("%1.1f " + (char)247 + "%1.1f = %1.3f \n", dblNumC, dblNumD, MathExamples.divide(dblNumC,dblNumD));
        DecimalFormat dFormat = new DecimalFormat("#, ###.###");
        System.out.println (dblNumC + " " + (char) 247 + " " + dblNumD + " = "+ dFormat.format(MathExamples.divide(dblNumC,dblNumD)));
        System.out.println(dblNumC + " to the power of " + dblNumD + " = " + dFormat.format(MathExamples.exponent(dblNumC,dblNumD)));
        System.out.println("The square root of " + dblNumC + " = " + dFormat.format(MathExamples.squareRoot(dblNumC)));
        System.out.println("The absolute value of " + dblNumC + " = "+ dFormat.format(MathExamples.absoluteVal(dblNumC)));
        double dblNumG = -9f;
        System.out.println("The absolute value of " + dblNumG + " = " + dFormat.format(MathExamples.absoluteVal(dblNumG)));
    }
}
