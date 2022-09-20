package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();
        double multiplicationResult = calculatorWithCounterAutoSuper.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithCounterAutoSuper.division(28.0, 5.0);
        double degreeResult = calculatorWithCounterAutoSuper.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithCounterAutoSuper.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithCounterAutoSuper.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterAutoSuper.getCountOperation()); //Ответ счетчика
    }
}
