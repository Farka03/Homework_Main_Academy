package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorWithMathCopyTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithOperator();

    @Test
    void division() {
        Assertions.assertEquals(4, calculatorWithMathCopy.division(20, 5));
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(100, calculatorWithMathCopy.multiplication(20, 5));
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(15, calculatorWithMathCopy.subtraction(20, 5));
    }

    @Test
    void addition() {
        Assertions.assertEquals(25, calculatorWithMathCopy.addition(20, 5));
    }

    @Test
    void degree() {
        Assertions.assertEquals(9, calculatorWithMathCopy.degree(3, 2));
    }

    @Test
    void module() {
        Assertions.assertEquals(2, calculatorWithMathCopy.module(-2));
    }

    @Test
    void rootNumber() {
        Assertions.assertEquals(2, calculatorWithMathCopy.rootNumber(4));
    }
}