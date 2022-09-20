package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassicMain extends CalculatorWithMathExtends {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
        double multiplicationResult = calculatorWithCounterClassic.multiplication(15.0, 7.0);
        //Тут я решил таким способом посчитать результат счетчика
        calculatorWithCounterClassic.incrementCountOperation();
        double divisionResult = calculatorWithCounterClassic.division(28.0, 5.0);
        calculatorWithCounterClassic.incrementCountOperation();
        double degreeResult = calculatorWithCounterClassic.degree(divisionResult, 2);
        calculatorWithCounterClassic.incrementCountOperation();
        double sumTwoResult = multiplicationResult + degreeResult;
        calculatorWithCounterClassic.incrementCountOperation();
        double addition = calculatorWithCounterClassic.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterClassic.getCountOperation()); //Ответ счетчика
    }
}
