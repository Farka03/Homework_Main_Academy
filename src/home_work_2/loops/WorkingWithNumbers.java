package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class WorkingWithNumbers {
    public static void main(String[] args) {
        //Ответ для 1.5.1
        System.out.println("Largest Digit of the number : " + LargestDigit());
        //Ответ для 1.5.2
        System.out.println("The Number of even numbers : " + evenNum());
        //Ответ для 1.5.3
        System.out.println("The Number of even numbers : " + evenOrOdd());
        //Ответ для 1.5.4
        System.out.println("Row : " + row());
        //Ответ для 1.5.5
        System.out.println(maxDiapason());
        //Ответ для 1.5.6
        System.out.println("Your couped number : " + coup());
    }

    //1.5.1 Данная функция находит наибольшую цифру натурального числа
    public static int LargestDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number : ");
        String number = scanner.nextLine();

        char[] firstArray = number.toCharArray();
        int[] secondArray = new int[number.length()];
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            secondArray[i] = Character.getNumericValue(firstArray[i]);
            if (secondArray[i] > largestValue) {
                largestValue = secondArray[i];
            }
        }
        return largestValue;
    }

    //1.5.2 Данная функция высчитывает вероятность четных чисел
    public static int evenNum() {
        int counter = 1;
        int[] array = new int[333];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //1.5.3 Данная функция считает четные и нечетные цифры числа
    public static int evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number : ");
        String number = scanner.nextLine();

        char[] firstArray = number.toCharArray();
        int[] secondArray = new int[number.length()];
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < number.length(); i++) {
            secondArray[i] = Character.getNumericValue(firstArray[i]);
            if (secondArray[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.print("The number of odd numbers : " + counterOdd);
        System.out.println();
        return counterEven;
    }

    //1.5.4 Ряд Фибоначчи
    public static String row() {
        StringBuilder finalResult = new StringBuilder(" ");
        int first = 1;
        int second = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number of symbols : ");
        int number = scanner.nextInt();

        if (number <= 0) {
            finalResult = new StringBuilder("Sorry, incorrect");
        } else if (number == 1) {
            finalResult.append(first);
        } else if (number == 2) {
            finalResult.append(first).append(" ").append(second);
        } else {
            finalResult.append(first).append(" ").append(second);
            for (int i = 0; i < number - 2; i++) {
                if (i % 2 == 0) {
                    first += second;
                    finalResult.append(" ").append(first);
                } else {
                    second += first;
                    finalResult.append(" ").append(second);
                }
            }
        }
        return finalResult.toString();
    }

    //1.5.5 Данная функция выводит ряд чисел в диапазоне с шагом
    public static String maxDiapason() {
        int minimum = 0;
        StringBuilder result = new StringBuilder("0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the diapason maximum : ");
        int maxValue = scanner.nextInt();
        System.out.print("Please, enter the step : ");
        int step = scanner.nextInt();

        while (minimum < maxValue) {
            minimum += step;
            result.append(" ").append(minimum);
        }
        return result.toString();
    }

    //1.5.6 Данная функция переворачивает числа
    public static String coup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String number = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        char[] array = number.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }
}
