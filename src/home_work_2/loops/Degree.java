package home_work_2.loops;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your factor : "); //Юзер вводит множитель
        double factor = scanner.nextInt(); //Записываем в переменную
        System.out.print("Please, enter your degree : "); //Юзер вводит степень

        if (scanner.hasNextInt()) { //Проверка на целое число
            int degree = scanner.nextInt(); //Записываем в переменную

            if (degree > 0) { //Если больше нуля то выполняется данный блок
                System.out.println(factor + " " + "^" + " " + degree + " = " + productOfNumbers(factor, degree));
            } else {
                System.out.println("Alas, the number is negative"); //Либо выполняется данный блок кода
            }
        } else {
            System.out.println("Alas, the number is either not an integer"); //Если не целое число то данный блок кода выполняется
        }
    }

    public static double productOfNumbers(double a, int b) { //Делаем метод с аргументами(множитель, степень в которую возводим)
        double result = 1; //Инициализируем переменную
        for (int i = 1; i <= b; i++) { //Цикл
            result = result * a; //Конечный результат, то есть число возведенное в степень
        }

        return result; //Возвращаем результат
    }
}
