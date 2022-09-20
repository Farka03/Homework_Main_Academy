package home_work_2.arrays;

//Интерфейс выводит все элементы в консоль, а также выводит каждый второй элемент и в обратном порядке
//Тут вывод всех элементов
public interface IArraysOperation {
    default StringBuilder interDoWhileCycle(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        do {
            stringBuilder.append(array[i] + " ");
            i++;
        } while (i < array.length);
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interElementWhileCycle(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            stringBuilder.append(array[i] + " ");
            i++;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForCycle(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i] + " ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForEachCycle(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element + " ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    //Тут вывод каждого второго элементов
    default StringBuilder interDoWhileCycleSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        do {
            if (i % 2 != 0 && i != 0) {
                stringBuilder.append(array[i] + " ");
            }
            i++;
        } while (i < array.length);
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interWhileCycleSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < array.length) {
            if (i % 2 != 0 && i != 0) {
                stringBuilder.append(array[i] + " ");
            }
            i++;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForCycleSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < array.length; ) {
            stringBuilder.append(array[i] + " ");
            i += 2;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForEachCycleSecond(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int element : array) {
            if (count % 2 == 0) {
                stringBuilder.append(element + " ");
            }
            count++;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    //Вывод в обратном порядке
    default StringBuilder interDoWhileCycleReverse(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = array.length - 1;
        do {
            stringBuilder.append(array[i] + " ");
            i--;
        } while (i >= 0);
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interWhileCycleReverse(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = array.length - 1;
        while (i >= 0) {
            stringBuilder.append(array[i] + " ");
            i--;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForCycleReverse(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i] + " ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    default StringBuilder interForEachCycleReverse(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int x = array.length - 1;
        for (int i : array) {
            stringBuilder.append(array[x] + " ");
            x--;
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }
}
