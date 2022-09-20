package home_work_1.consolname;

import java.util.Objects;
import java.util.Scanner;

public class NameFromConsoleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Пожалуйста, введите ваше имя : "); //Юзер вводит имя
        String name = scanner.nextLine(); //Записываем в переменную

        System.out.println(equalsNameIf(name));

        scanner.close(); //Закрываем сканнер
    }

    public static String equalsNameIf(String name) {
        String typeLine; //Вводим нашу строчку
        if (Objects.equals(name, "Вася")) { //Если имя Вася
            typeLine = "Привет\nЯ тебя так долго ждал";
            return typeLine;
        }
        if (Objects.equals(name, "Анастасия")) { //Если Анастасия
            typeLine = "Я тебя так долго ждал";
            return typeLine;
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")) {
            typeLine = "Добрый день, а вы кто?";
            return typeLine;
        }
        return null;
    }
}

