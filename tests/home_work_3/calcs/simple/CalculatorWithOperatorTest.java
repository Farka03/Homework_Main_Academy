package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorWithOperatorTest {

    ICalculator calculatorWithOperator = new CalculatorWithOperator();

    @Test
    void division() {
        Assertions.assertEquals(4, calculatorWithOperator.division(20, 5));
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(100, calculatorWithOperator.multiplication(20, 5));
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(15, calculatorWithOperator.subtraction(20, 5));
    }

    @Test
    void addition() {
        Assertions.assertEquals(25, calculatorWithOperator.addition(20, 5));
    }

    @Test
    void degree() {
        Assertions.assertEquals(9, calculatorWithOperator.degree(3, 2));
    }

    @Test
    void module() {
        Assertions.assertEquals(2, calculatorWithOperator.module(-2));
    }

    @Test
    void rootNumber() {
        Assertions.assertEquals(2, calculatorWithOperator.rootNumber(4));
    }
}