package home_work_4;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> { //Класс дженерик
    private T[] data; //Поле

    public DataContainer(T[] data) { //Конструктор
        this.data = data;
    }

    //Метод, который добавляет данные
    public int add(T item) {
        if (item != null) { //Если итем не налл, то:
            for (int i = 0; i <= data.length - 1; i++) {
                if (data[i] == null) {
                    this.data[i] = item;
                    return i; //Возвращает номер позиции
                }
            } //Если массив заполнен, то расширяем его и добавляем
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = item;
            return data.length - 1; //Возвращаем последний элемент
        }
        return -1; //Индикатор, что элемент нельзя вставить
    }

    //Возврат содержимого ячейки по индексу
    public T get(int index) {
        if (index <= data.length - 1) {
            return data[index];
        }
        return null;
    }

    //Возвращает поле дата
    public T[] getItems() {
        return data;
    }

    //Метод удаляет элемент из поля data по индексу
    public boolean delete(int index) {
        if (index < data.length && data[index] != null) {
            if (data.length - 1 - index >= 0) {
                System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    //Удаляет элемент из поля data
    public boolean delete(T item) {
        boolean finalResult = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                delete(i);
                finalResult = true;
            }
        }
        return finalResult;
    }

    //Метод занимается сортировкой данных записанных в поле data
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int k = i + 1; k < data.length; k++) {
                if (comparator.compare(data[k], data[i]) > 0) {
                    T temp = data[k];
                    data[k] = data[i];
                    data[i] = temp;
                }
            }
        }
    }

    //Переопределяем метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : data) {
            if (element != null) {
                stringBuilder.append(element).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    //Данный етод сортирует элементы в переданном объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        T[] info = dataContainer.getItems();
        for (int i = 0; i < info.length - 1; i++) {
            if (info[i] == null) {
                T temp = info[i];
                info[i] = info[i + 1];
                info[i + 1] = temp;
            } else {
                for (int k = i + 1; k < info.length; k++) {
                    if (info[k] != null) {
                        if (info[i].compareTo(info[k]) > 0) {
                            T temp = info[k];
                            info[k] = info[i];
                            info[i] = temp;
                        }
                    }
                }
            }
        }
    }

    //Данный метод будет сортирует элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию сравнения из переданного объекта интерфейса Comparator.
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] info = container.getItems();
        for (int i = 0; i < info.length - 1; i++) {
            if (info[i] == null) {
                T temp = info[i];
                info[i] = info[i + 1];
                info[i + 1] = temp;
            } else {
                for (int k = i + 1; k < info.length; k++) {
                    if (info[k] != null) {
                        if (comparator.compare(info[i], info[k]) > 0) {
                            T temp = info[k];
                            info[k] = info[i];
                            info[i] = temp;
                        }
                    }
                }
            }
        }
    }

    //Переопределяем итератор
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int result;

            @Override
            public boolean hasNext() { //Проверка на след.элемент, если его нет - то false, если есть - true
                return result < data.length;
            }

            @Override //Переход к след.элементу
            public T next() {
                return data[result++];
            }
        };
    }
}

