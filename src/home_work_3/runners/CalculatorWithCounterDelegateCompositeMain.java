package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite = new CalculatorWithCounterAutoComposite();
        double multiplicationResult = calculatorWithCounterAutoComposite.multiplication(15.0, 7.0);
        calculatorWithCounterAutoComposite.getCountOperation();
        double divisionResult = calculatorWithCounterAutoComposite.division(28.0, 5.0);
        calculatorWithCounterAutoComposite.getCountOperation();
        double degreeResult = calculatorWithCounterAutoComposite.degree(divisionResult, 2);
        calculatorWithCounterAutoComposite.getCountOperation();
        double sumTwoResult = calculatorWithCounterAutoComposite.addition(multiplicationResult, degreeResult);
        calculatorWithCounterAutoComposite.getCountOperation();
        double addition = calculatorWithCounterAutoComposite.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterAutoComposite.getCountOperation()); //Ответ счетчика
    }
}
