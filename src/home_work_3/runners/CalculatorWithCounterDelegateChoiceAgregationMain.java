package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double multiplicationResult = calculatorWithCounterAutoChoiceAgregation.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithCounterAutoChoiceAgregation.division(28.0, 5.0);
        double degreeResult = calculatorWithCounterAutoChoiceAgregation.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithCounterAutoChoiceAgregation.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithCounterAutoChoiceAgregation.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterAutoChoiceAgregation.getCountOperation()); //Ответ счетчика

        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        //Создаем объект и далее считаем пример
        double multiplicationResult1 = calculatorWithCounterAutoChoiceAgregation1.multiplication(15.0, 7.0);
        double divisionResult1 = calculatorWithCounterAutoChoiceAgregation1.division(28.0, 5.0);
        double degreeResult1 = calculatorWithCounterAutoChoiceAgregation1.degree(divisionResult1, 2);
        double sumTwoResult1 = calculatorWithCounterAutoChoiceAgregation1.addition(multiplicationResult1, degreeResult1);
        double addition1 = calculatorWithCounterAutoChoiceAgregation1.addition(4.1, sumTwoResult1);
        System.out.println(addition1); //Ответ примера
        System.out.println(calculatorWithCounterAutoChoiceAgregation1.getCountOperation()); //Ответ счетчика

        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        //Создаем объект и далее считаем пример
        double multiplicationResult2 = calculatorWithCounterAutoChoiceAgregation2.multiplication(15.0, 7.0);
        double divisionResult2 = calculatorWithCounterAutoChoiceAgregation2.division(28.0, 5.0);
        double degreeResult2 = calculatorWithCounterAutoChoiceAgregation2.degree(divisionResult2, 2);
        double sumTwoResult2 = calculatorWithCounterAutoChoiceAgregation2.addition(multiplicationResult2, degreeResult2);
        double addition2 = calculatorWithCounterAutoChoiceAgregation2.addition(4.1, sumTwoResult2);
        System.out.println(addition2); //Ответ примера
        System.out.println(calculatorWithCounterAutoChoiceAgregation2.getCountOperation()); //Ответ счетчика
    }
}
