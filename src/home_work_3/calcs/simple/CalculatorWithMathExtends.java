package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    //Наследуемся от CalculatorWithOperator и переопределяем три метода
    @Override
    public double degree(double number, int numberDegree) {
        return Math.pow(number, numberDegree);
    }

    @Override
    public double module(double moduleNum) {
        return Math.abs(moduleNum);
    }

    @Override
    public double rootNumber(double rootNum) {
        return Math.sqrt(rootNum);
    }
}
