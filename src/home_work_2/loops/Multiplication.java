package home_work_2.loops;

import java.util.Scanner;

//Даный класс высчитывает перемножение всех цифр числа.
//В вклассе Multiplication юзер вводит число и проверяем его
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the number : ");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(" = " + multiplyNumbers(number));
        } else if (scan.hasNextDouble()) {
            System.out.println("Sorry, the number is not integer");
        } else {
            System.out.println("Oops, it is no the number");
        }
    }

    //В методе multiplyNumbers умножает цифры друг на друга и возвращает результат, то есть произведение
    public static long multiplyNumbers(int number) {
        String num = Integer.toString(number);
        long result = 1;

        int[] array = new int[num.length()];
        for (int i = array.length - 1; i >= 0; i--) {
            if (number > 9) {
                array[i] = number % 10;
                number /= 10;
            } else {
                array[i] = number;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
                result *= array[i];
            } else {
                System.out.print(" * " + array[i]);
                result *= array[i];
            }
        }
        return result;
    }
}

