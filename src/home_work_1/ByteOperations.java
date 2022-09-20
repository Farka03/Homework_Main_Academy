package home_work_1;

import java.util.Scanner;

public class ByteOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Создаем объект
        System.out.print("Please, enter number 1 : "); //Ввод с клавиатуры первого числа
        int numberOne = scanner.nextInt(); //Первое число записываем в переменную
        //Допустим, если мы возьмем число 27, то его двоичным представлением будет 11011
        System.out.print("Please, enter number 2 : "); //Ввод с клавиатуры второго числа
        int numberSecond = scanner.nextInt(); //Второе число записываем в переменную
        //Допустим, если мы возьмем число 30, то его двоичным представлением будет 11110

        int byteOr = numberOne | numberSecond; //Побитовый ИЛИ (Результатом для чисел 20 и 30 будет 11111, то есть 31)
        int byteAnd = numberOne & numberSecond; //Побитовый И (Результатом для чисел 20 и 30 будет 11010, то есть 26)
        System.out.println("Your result for ByteOr : " + byteOr); //Выводим результат побитого ИЛИ
        System.out.println("Your result for ByteAnd : " + byteAnd); //Выводим результат побитого И

        scanner.close(); //Закрываем сканнер
    }
}

//При вводе в консоль числа 42.5, мы получаем в логе ошибку. Из дробного числа нельзя сделать двоичное представление.