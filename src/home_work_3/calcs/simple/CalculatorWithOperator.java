package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    //Создаем функции для подсчета деления, умножения, суммы, разницы, степени, модуля и квадратного корня
    public double division(double dividend, double divider) {
        return dividend / divider;
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        return firstMultiply * secondMultiply;
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        return firstSubtraction - secondSubtraction;
    }

    public double addition(double firstAddition, double secondAddition) {
        return firstAddition + secondAddition;
    }

    public double degree(double number, int numberDegree) {
        double result = 1;
        for (int i = 1; i <= numberDegree; i++) {
            result = result * number;
        }
        return result;
    }

    public double module(double moduleNum) {
        return (moduleNum < 0) ? -moduleNum : moduleNum;
    }

    public double rootNumber(double rootNum) {
        return Math.sqrt(rootNum);
    }
}
