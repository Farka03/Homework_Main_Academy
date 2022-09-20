package home_work_1.consolname;

import java.util.Scanner;

public class NameFromConsoleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Пожалуйста, введите имя : "); //Юзер вводит имя
        String name = scanner.nextLine(); //Записываем в переменную

        System.out.println(equalsSwitch(name));

        scanner.close(); //Закрываем сканнер
    }

    public static String equalsSwitch(String name) {
        String typeLine; //Выводим нашу строчку
        switch (name) { //Берем имя
            case ("Вася"): { //Если Вася, то выводим это
                typeLine = "Привет\nЯ тебя так долго ждал";
                return typeLine;
            }
            case ("Анастасия"): //Если Анастасия, то выводим это
                typeLine = "Я тебя так долго ждал";
                return typeLine;
            default: //Если ни то ни другое, то выводим это
                typeLine = "Добрый день, а вы кто?";
                return typeLine;
        }
    }
}
