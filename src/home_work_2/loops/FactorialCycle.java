package home_work_2.loops;

import java.util.Scanner;

public class FactorialCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your number : "); //Юзер вводит число
        int number = scanner.nextInt(); //Записываем в переменную

        int i = 1;
        int result = 1;

        while (i < number) { //Если 1 меньше number, то:
            System.out.print(i + " * ");//Выводим числа, которые умножаются
            result *= ++i; //Считаем результат
        }
        System.out.print(i + " = " + result); //Выводим результат
    }
}
