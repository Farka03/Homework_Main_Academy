package home_work_2.loops.overflow;

import java.util.Scanner;

public class OverflowProblemWithConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number : ");
        int number = scanner.nextInt();

        long result = 1;
        long beforeOverflow = 0;

        for (; ; ) { //Делаем теперь только со значениями, введеными через консоль
            try {
                result = Math.multiplyExact(result, number);
                beforeOverflow = result;
            } catch (ArithmeticException e) {
                System.out.println("The result before overflow : " + beforeOverflow / number + " " + "The result after overflow : " + result);
                break;
            }
        }
    }
}
