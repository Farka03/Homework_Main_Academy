package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper(); //Объект

    //Все методы, которые считают пример + счетчик считает
    public double division(double dividend, double divider) {
        return calculatorWithCounterAutoSuper.division(dividend, divider);
    }

    public double multiplication(double firstMultiply, double secondMultiply) {
        return calculatorWithCounterAutoSuper.multiplication(firstMultiply, secondMultiply);
    }

    public double subtraction(double firstSubtraction, double secondSubtraction) {
        return calculatorWithCounterAutoSuper.subtraction(firstSubtraction, secondSubtraction);
    }

    public double addition(double firstAddition, double secondAddition) {
        return calculatorWithCounterAutoSuper.addition(firstAddition, secondAddition);
    }

    public double degree(double number, int numberDegree) {
        return calculatorWithCounterAutoSuper.degree(number, numberDegree);
    }

    public double module(double moduleNum) {
        return calculatorWithCounterAutoSuper.module(moduleNum);
    }

    public double rootNumber(double rootNum) {
        return calculatorWithCounterAutoSuper.rootNumber(rootNum);
    }

    //Возвращаем счетчик
    public long getCountOperation() {
        return calculatorWithCounterAutoSuper.getCountOperation();
    }
}
