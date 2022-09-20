package home_work_1.branching;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter the number you want to convert : "); //Просим юзера ввести число для конвертации
        float numberToConvert = scanner.nextInt(); //Записываем числа в переменную
        System.out.print("Please, choose what you want to convert to: bytes - 1, kilobytes - 2 : "); //Просим юзера сделать выбор
        float numberChoose = scanner.nextInt(); //Выбор записываем в переменную

        System.out.println(choose(numberToConvert, numberChoose));

        scanner.close(); //Закрываем сканнер
    }

    public static float choose(float numberConv, float numberChoose) {
        int firstChoice = 1; //Объявляем переменные выбора
        float mainNum = 1024f; //float, потому что при делении нам не обязательно нужно будет целое значение. К примеру если 100 на 1024 поделим.

        if (numberChoose == firstChoice) { //Если выбор 1, то есть в байты, то умножаем на 1024
            return numberConv * mainNum;
        } else {  //Или делим на 1024
            return numberConv / mainNum;
        }
    }
}
