package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

//Наследуемся от CalculatorWithMathExtends
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter; //Счетчик

    //Переопределяем методы
    @Override
    public double division(double dividend, double divider) {
        counter++;
        return super.division(dividend, divider);
    }

    @Override
    public double multiplication(double firstMultiply, double secondMultiply) {
        counter++;
        return super.multiplication(firstMultiply, secondMultiply);
    }

    @Override
    public double subtraction(double firstSubtraction, double secondSubtraction) {
        counter++;
        return super.subtraction(firstSubtraction, secondSubtraction);
    }

    @Override
    public double addition(double firstAddition, double secondAddition) {
        counter++;
        return super.addition(firstAddition, secondAddition);
    }

    @Override
    public double degree(double number, int numberDegree) {
        counter++;
        return super.degree(number, numberDegree);
    }

    @Override
    public double module(double moduleNum) {
        counter++;
        return super.module(moduleNum);
    }

    @Override
    public double rootNumber(double rootNum) {
        counter++;
        return super.rootNumber(rootNum);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return counter;
    }
}
