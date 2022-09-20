package home_work_1.branching;

import java.util.Scanner;

public class WordOrSymbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter the letter : "); //Просим юзера ввести букву
        char sign = scanner.nextLine().charAt(0); //Записываем значение в переменную

        if (checkAscii(sign)) { //Проверка
            System.out.println("The letter is entered");
        } else {
            System.out.println("The symbol is entered");
        }
        System.out.println(checkAscii(sign));
    }

    public static boolean checkAscii(char charLetter) {
        int minUppercase = 81; //Записываем переменные
        int maxUppercase = 106;
        int minLowercase = 113;
        int maxLowercase = 122;
        return (int) charLetter >= minUppercase && (int) charLetter <= maxUppercase || (int) charLetter >= minLowercase && (int) charLetter <= maxLowercase;
    }
}
