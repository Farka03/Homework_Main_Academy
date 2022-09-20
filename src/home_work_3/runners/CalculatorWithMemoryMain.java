package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args){
        ICalculator iCalculator = new CalculatorWithMathCopy(); //Объект
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(iCalculator); //Передаем в объект аргумент
        double multiplicationResult = calculatorWithMemory.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithMemory.division(28.0, 5.0);
        double degreeResult = calculatorWithMemory.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithMemory.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithMemory.addition(4.1, sumTwoResult); //Считаем
        calculatorWithMemory.memo();
        System.out.println(addition);
        System.out.println(calculatorWithMemory.returnMemo());
    }
}
