package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        WhileOperation whileOperation = new WhileOperation();//Создаем объект класса
        /*
          Выводим в консоль результат, используя объект класса ForEachOperation и класс arrayFromConsole
         */
        System.out.println(whileOperation.interElementWhileCycle(ArraysUtils.arrayFromConsole()));
        System.out.println(whileOperation.interWhileCycleSecond(ArraysUtils.arrayFromConsole()));
        System.out.println(whileOperation.interWhileCycleReverse(ArraysUtils.arrayFromConsole()));
    }
}
