package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class DoWhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        DoWhileOperation doWhileOperation = new DoWhileOperation(); //Создаем объект класса
        /*
         * Выводим в консоль результат, используя объект класса ForEachOperation и класс arrayFromConsole
         */
        System.out.println(doWhileOperation.interDoWhileCycle(ArraysUtils.arrayFromConsole()));
        System.out.println(doWhileOperation.interDoWhileCycleSecond(ArraysUtils.arrayFromConsole()));
        System.out.println(doWhileOperation.interDoWhileCycleReverse(ArraysUtils.arrayFromConsole()));
    }
}
