package home_work_4;

import home_work_4.comparator.ComparatorForInt;

import java.util.Arrays;
import java.util.Iterator;


public class DataMain {
    public static void main(String[] args) {
        int value = 0;

        Integer[] data = new Integer[6]; //Создаем интовый массив на 6 элементов
        DataContainer<Integer> dataContainer = new DataContainer<>(data); //Интовый контейнер
        ComparatorForInt comparatorForInt = new ComparatorForInt(); //Компаратор
        Iterator<Integer> iterator = dataContainer.iterator();

        dataContainer.add(5); //Добавляем значения в контейнер
        dataContainer.add(9);
        dataContainer.add(3);
        dataContainer.add(2);
        System.out.println(Arrays.toString(dataContainer.getItems())); //Получаем значения

        System.out.println(dataContainer.delete(2)); //Удаляем элемент со вторым инлексом

        System.out.println(Arrays.toString(dataContainer.getItems())); //Получаем новый контейнер

        System.out.println(dataContainer.get(4)); //Получаем что на 4 индексе
        System.out.println(dataContainer.delete(dataContainer.get(4))); //Пытаемся удалить 4 элемент, но увы он нулл, не удалим
        System.out.println(dataContainer.get(4)); //Получаем контейнер

        dataContainer.sort(comparatorForInt); //Сортировка
        System.out.println(Arrays.toString((dataContainer.getItems())));

        DataContainer.sort(dataContainer); //Сортировка
        System.out.println(Arrays.toString((dataContainer.getItems())));

        DataContainer.sort(dataContainer, comparatorForInt); //Сортировка
        System.out.println(Arrays.toString(dataContainer.getItems()));

        while (iterator.hasNext()) { //Вывод результат по итератору
            System.out.println(iterator.next());
        }
    }
}
