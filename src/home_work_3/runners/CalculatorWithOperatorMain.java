package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        double multiplicationResult = calculatorWithOperator.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithOperator.division(28.0, 5.0);
        double degreeResult = calculatorWithOperator.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithOperator.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithOperator.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
    }
}
