package home_work_1.consolname;

import java.util.Objects;
import java.util.Scanner;

public class NameFromConsoleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Пожалуйста, введите имя : "); //Юзер вводит имя
        String name = scanner.nextLine(); //Записываем в переменную

        System.out.println(equalsNameIfElse(name));

        scanner.close(); //Закрываем сканнер
    }

    public static String equalsNameIfElse(String name) {
        String typeLine; //Выводим нашу строчку
        if (Objects.equals(name, "Вася")) { //Если имя Вася
            typeLine = "Привет\nЯ тебя так долго ждал";
            return typeLine;
        } else if (Objects.equals(name, "Анастасия")) { //Если Анастасия
            typeLine = "Я тебя так долго ждал";
            return typeLine;
        } else {
            typeLine = "Добрый день, а вы кто?";
            return typeLine;
        }
    }
}
