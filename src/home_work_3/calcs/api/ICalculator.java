package home_work_3.calcs.api;

public interface ICalculator { //Интерфейс, в котором объявляем наши методы
    double division(double dividend, double divider);

    double multiplication(double firstMultiply, double secondMultiply);

    double subtraction(double firstSubtraction, double secondSubtraction);

    double addition(double firstAddition, double secondAddition);

    double degree(double number, int numberDegree);

    double module(double moduleNum);

    double rootNumber(double rootNum);
}