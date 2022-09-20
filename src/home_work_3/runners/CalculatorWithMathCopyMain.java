package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        double multiplicationResult = calculatorWithMathCopy.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithMathCopy.division(28.0, 5.0);
        double degreeResult = calculatorWithMathCopy.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithMathCopy.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithMathCopy.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
    }
}
