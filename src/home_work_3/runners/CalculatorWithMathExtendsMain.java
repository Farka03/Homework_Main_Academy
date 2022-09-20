package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        //Создаем объект и далее считаем пример
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        double multiplicationResult = calculatorWithMathExtends.multiplication(15.0, 7.0);
        double divisionResult = calculatorWithMathExtends.division(28.0, 5.0);
        double degreeResult = calculatorWithMathExtends.degree(divisionResult, 2);
        double sumTwoResult = calculatorWithMathExtends.addition(multiplicationResult, degreeResult);
        double addition = calculatorWithMathExtends.addition(4.1, sumTwoResult);
        System.out.println(addition); //Ответ примера
    }
}
