package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperation implements IArraysOperation {
    public static void main(String[] args) {
        ForEachOperation forEachOperation = new ForEachOperation(); //Создаем объект класса
        /*
         * Выводим в консоль результат, используя объект класса ForEachOperation и класс arrayFromConsole
         */
        System.out.println(forEachOperation.interForEachCycle(ArraysUtils.arrayFromConsole()));
        System.out.println(forEachOperation.interForEachCycleSecond(ArraysUtils.arrayFromConsole()));
        System.out.println(forEachOperation.interForEachCycleReverse(ArraysUtils.arrayFromConsole()));
    }
}
