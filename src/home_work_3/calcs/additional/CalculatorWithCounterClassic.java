package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    //Наследуемся от CalculatorWithMathExtends, создаем счетчик и две функции
    private long counter; //Счетчик

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        incrementCountOperation();
        return counter;
    }
}
