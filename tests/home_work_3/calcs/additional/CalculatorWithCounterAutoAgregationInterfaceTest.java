package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorWithCounterAutoAgregationInterfaceTest {

    ICalculator calculatorWithCounterAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

    @Test
    void division() {
        Assertions.assertEquals(4, calculatorWithCounterAutoAgregationInterface.division(20, 5));
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(100, calculatorWithCounterAutoAgregationInterface.multiplication(20, 5));
    }

    @Test
    void subtraction() {
        Assertions.assertEquals(15, calculatorWithCounterAutoAgregationInterface.subtraction(20, 5));
    }

    @Test
    void addition() {
        Assertions.assertEquals(25, calculatorWithCounterAutoAgregationInterface.addition(20, 5));
    }

    @Test
    void degree() {
        Assertions.assertEquals(9, calculatorWithCounterAutoAgregationInterface.degree(3, 2));
    }

    @Test
    void module() {
        Assertions.assertEquals(2, calculatorWithCounterAutoAgregationInterface.module(-2));
    }

    @Test
    void rootNumber() {
        Assertions.assertEquals(2, calculatorWithCounterAutoAgregationInterface.rootNumber(4));
    }
}