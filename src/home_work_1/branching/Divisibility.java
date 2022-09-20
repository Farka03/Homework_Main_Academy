package home_work_1.branching;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter your dividend : "); //Просим юзера ввести первое число
        int numberFirst = scanner.nextInt(); //Записываем первое число в переменную
        System.out.print("Please, enter your divider : "); //Просим юзера ввести первое число
        int numberSecond = scanner.nextInt(); //Записываем второе число в переменную

        if (checkDivisibility(numberFirst, numberSecond)) {
            System.out.print("Number to divide without a reminder : " + numberFirst / numberSecond);
        } else {
            System.out.println("Remainder : " + (float) numberFirst / numberSecond);
        }
        scanner.close(); //Закрываем сканнер
    }

    public static boolean checkDivisibility(int numFirst, int numSecond) {
        return numFirst % numSecond == 0;
    }
}
