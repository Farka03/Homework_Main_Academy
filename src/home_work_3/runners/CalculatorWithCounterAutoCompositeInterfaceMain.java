package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        //Создаем объекты и далее считаем пример
        ICalculator iCalculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculatorWithCounterAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface(iCalculator);
        double multiplicationResult = calculatorWithCounterAutoAgregationInterface.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithCounterAutoAgregationInterface.division(28.0, 5.0);
        double degreeResult = calculatorWithCounterAutoAgregationInterface.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithCounterAutoAgregationInterface.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithCounterAutoAgregationInterface.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
        System.out.println(calculatorWithCounterAutoAgregationInterface.getCountOperation()); //Ответ счетчика
    }
}
