package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    //Поля
    ICalculator iCalculator;
    private double memory;
    private double lastRes;

    public CalculatorWithMemory(ICalculator iCalculator) { //Нащ конструктор
        this.iCalculator = iCalculator;
    }

    //Тут сохраняется результат последнего выполненного метода
    private void lastRes(double lastResult) {
        this.lastRes = lastResult;
    }

    //Результат последней операции
    public void memo() {
        memory = lastRes;
    }

    //Возвращает результат последней операции и очищает память
    public double returnMemo() {
        double tmp = memory;
        memory = 0;
        return tmp;
    }

    public double division(double dividend, double divider) {
        lastRes(iCalculator.division(dividend, divider));
        return iCalculator.division(dividend, divider);
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        lastRes(iCalculator.multiplication(firstMultiply, secondMultiply));
        return iCalculator.multiplication(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        lastRes(iCalculator.subtraction(firstSubtraction, secondSubtraction));
        return iCalculator.subtraction(firstSubtraction, secondSubtraction);
    }

    public double addition(double firstAddition, double secondAddition) {
        lastRes(iCalculator.addition(firstAddition, secondAddition));
        return iCalculator.addition(firstAddition, secondAddition);
    }

    public double degree(double number, int numberDegree) {
        lastRes(iCalculator.degree(number, numberDegree));
        return iCalculator.degree(number, numberDegree);
    }

    public double module(double moduleNum) {
        lastRes(iCalculator.module(moduleNum));
        return iCalculator.module(moduleNum);
    }

    public double rootNumber(double rootNum) {
        lastRes(iCalculator.rootNumber(rootNum));
        return iCalculator.rootNumber(rootNum);
    }
}
