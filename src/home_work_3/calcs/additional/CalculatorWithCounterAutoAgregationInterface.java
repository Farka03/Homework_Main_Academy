package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    ICalculator iCalculator; //Поле
    private long counter; //Счетчик

    public CalculatorWithCounterAutoAgregationInterface(ICalculator icalculator) { //Конструктор
        this.iCalculator = icalculator;
    }

    //Все методы, которые считают пример + счетчик считает
    public double division(double dividend, double divider) {
        counter++;
        return iCalculator.division(dividend, divider);
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        counter++;
        return iCalculator.multiplication(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        return iCalculator.subtraction(firstSubtraction, secondSubtraction);
    }

    public double addition(double firstAddition, double secondAddition) {
        counter++;
        return iCalculator.addition(firstAddition, secondAddition);
    }

    public double degree(double number, int numberDegree) {
        counter++;
        return iCalculator.degree(number, numberDegree);
    }

    public double module(double moduleNum) {
        counter++;
        return iCalculator.module(moduleNum);
    }

    public double rootNumber(double rootNum) {
        counter++;
        return iCalculator.rootNumber(rootNum);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }
}
