package home_work_2.loops;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number : "); //Юзер вводит число
        int number = scan.nextInt(); //Записываем в переменную

        if (number > 0) { //Если больше нуля, то выполняется данный блок кода
            System.out.print("1");
            long result = factorial(number); //Передаем аргумент функции
            System.out.println(" = " + result);
        } else {
            System.out.print("Please, enter positive number : "); //Или этот блок кода выполняется
        }
    }

    public static long factorial(int number) { //Фунция с аргументом
        long result = 1;
        if (number == 1 || number == 0) {
            return result; //Возвращаем результат если равен одному или нулю
        }
        result = number * factorial(number - 1);
        System.out.print(" * " + number);
        if (result < 0) { //Если меньше нуля результат то выводим блок кода
            System.out.println("Sorry, but there was an error");
            System.exit(1); //Завершение программы
        }
        return result;
    }
}
