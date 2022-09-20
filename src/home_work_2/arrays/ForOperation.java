package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForOperation implements IArraysOperation {
    public static void main(String[] args) {
        ForOperation forOperation = new ForOperation(); //Создаем объект класса
        /*
         * Выводим в консоль результат, используя объект класса ForEachOperation и класс arrayFromConsole
         */
        System.out.println(forOperation.interForCycle(ArraysUtils.arrayFromConsole()));
        System.out.println(forOperation.interForCycleSecond(ArraysUtils.arrayFromConsole()));
        System.out.println(forOperation.interForCycleReverse(ArraysUtils.arrayFromConsole()));
    }
}
