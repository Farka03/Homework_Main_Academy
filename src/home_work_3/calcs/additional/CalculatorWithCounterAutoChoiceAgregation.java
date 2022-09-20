package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator calculatorWithOperator; //Поле
    CalculatorWithMathCopy calculatorWithMathCopy; //Поле
    CalculatorWithMathExtends calculatorWithMathExtends; //Поле
    private long counter; //Счетчик

    //Три конструктора
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }

    //Все методы, которые считают пример + счетчик считает
    public double division(double dividend, double divider) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.division(dividend, divider);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(dividend, divider);
        } else {
            return calculatorWithMathExtends.division(dividend, divider);
        }
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiplication(firstMultiply, secondMultiply);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiplication(firstMultiply, secondMultiply);
        } else {
            return calculatorWithMathExtends.multiplication(firstMultiply, secondMultiply);
        }
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(firstSubtraction, secondSubtraction);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(firstSubtraction, secondSubtraction);
        } else {
            return calculatorWithMathExtends.subtraction(firstSubtraction, secondSubtraction);
        }
    }

    public double addition(double firstAddition, double secondAddition) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.addition(firstAddition, secondAddition);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithOperator.addition(firstAddition, secondAddition);
        } else {
            return calculatorWithOperator.addition(firstAddition, secondAddition);
        }
    }

    public double degree(double number, int numberDegree) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.degree(number, numberDegree);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithOperator.degree(number, numberDegree);
        } else {
            return calculatorWithOperator.degree(number, numberDegree);
        }
    }

    public double module(double moduleNum) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.module(moduleNum);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithOperator.module(moduleNum);
        } else {
            return calculatorWithOperator.module(moduleNum);
        }
    }

    public double rootNumber(double rootNum) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.rootNumber(rootNum);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithOperator.rootNumber(rootNum);
        } else {
            return calculatorWithOperator.rootNumber(rootNum);
        }
    }
}
