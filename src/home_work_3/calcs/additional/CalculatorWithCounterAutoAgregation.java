package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithMathCopy calculatorWithMathCopy; //Поле
    private long counter; //Счетчик

    //Конструктор
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    //Все методы, которые считают пример + счетчик считает
    public double division(double dividend, double divider) {
        counter++;
        return calculatorWithMathCopy.division(dividend, divider);
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        counter++;
        return calculatorWithMathCopy.multiplication(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        return calculatorWithMathCopy.subtraction(firstSubtraction, secondSubtraction);
    }

    public double addition(double firstAddition, double secondAddition) {
        counter++;
        return calculatorWithMathCopy.addition(firstAddition, secondAddition);
    }

    public double degree(double number, int numberDegree) {
        counter++;
        return calculatorWithMathCopy.degree(number, numberDegree);
    }

    public double module(double moduleNum) {
        counter++;
        return calculatorWithMathCopy.module(moduleNum);
    }

    public double rootNumber(double rootNum) {
        counter++;
        return calculatorWithMathCopy.rootNumber(rootNum);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }
}
