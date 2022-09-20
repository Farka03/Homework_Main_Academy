package home_work_2.utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        //Ответ для задания 2.1.1
        int[] container = arrayFromConsole(); //Объект
        System.out.println(Arrays.toString(container)); //Выводим результат

        //Для задания 2.1.2
        Scanner scanner = new Scanner(System.in); //Создаем объект сканнера
        System.out.print("Enter array length : "); //Юзер вводит длину
        int length = scanner.nextInt();
        System.out.print("Enter array max value for random : ");
        int generate = scanner.nextInt(); //Юзер максимальное значение для рандома
        int[] container1 = arrayRandom(length, generate); //Передаем наши аргументы
        System.out.println(Arrays.toString(container1)); //Выводим
    }

    //Запрашивает у пользователя через консоль
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in); //Создаем объект сканнера
        System.out.print("Enter array length : ");
        int size = scanner.nextInt(); //Юзер вводит размер массива и записываем в переменную

        int[] container = new int[size]; // Создаём массив int размером в size
        System.out.print("Insert array elements : ");
        for (int i = 0; i < size; i++) { //Проходимся по массиву и заполняем
            container[i] = scanner.nextInt(); //Массив заполняется с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            String result = " " + container[i]; //Выводим массив
        }
        return container; //Возвращаем контейнер
    }

    //Рандомно генерит
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size]; //Создаем массив

        for (int i = 0; i < size; i++) { //Проходимся по массиву и заполняем
            array[i] = (int) (Math.random() * maxValueExclusion); //Массив заполняется рандомными числам до диапазона. Использовал Math.
        }
        for (int i = 0; i < size; i++) {
            String result = " " + array[i]; //Выводим массив
        }
        return array; //Возвращаем
    }
}
