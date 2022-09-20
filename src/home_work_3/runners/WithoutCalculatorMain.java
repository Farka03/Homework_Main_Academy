package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        int f = 2;
        double division = d / e;
        //Считаем результат и записываем в переменную result
        double result = a + b * c + Math.pow(division, f); //Ответ: 140.45999999999998
        System.out.println(result); //Выводим результат
    }
}
