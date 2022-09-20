package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithCounterAutoAgregation calculatorWithCounterAutoAgregation = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double multiplicationResult = calculatorWithCounterAutoAgregation.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithCounterAutoAgregation.division(28.0, 5.0);
        double degreeResult = calculatorWithCounterAutoAgregation.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithCounterAutoAgregation.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithCounterAutoAgregation.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterAutoAgregation.getCountOperation()); //Ответ счетчика
    }
}
