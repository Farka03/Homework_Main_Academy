package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WorkWithArrays {
    public static void main(String[] args) {
        System.out.println(sumEven(ArraysUtils.arrayRandom(50, 100)));
        System.out.println(maxEven(ArraysUtils.arrayRandom(50, 100)));
        System.out.println(averageValue(ArraysUtils.arrayRandom(50, 100)));
        System.out.println(twoMinimums(ArraysUtils.arrayRandom(50, 100)));
        System.out.println(squeeze(ArraysUtils.arrayRandom(50, 100)));
        System.out.println(sumNumbersArray(ArraysUtils.arrayRandom(50, 100)));
    }

    //2.4.1 Нахождение суммы всех четных чисел в массиве
    public static int sumEven(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //2.4.2 Нахождение максимального четного числа в массиве
    public static int maxEven(int[] array) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        }
        return maxValue;
    }

    //2.4.3 Нахождение всех чисел меньше среднеарифмитического
    public static StringBuilder averageValue(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }

        int average = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (i < average) {
                stringBuilder.append(i + " ");
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder;
    }

    //2.4.4 Два минимальных числа
    public static StringBuilder twoMinimums(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int minimum = Integer.MAX_VALUE;
        int minimum2 = Integer.MAX_VALUE - 1;

        for (int element : array) {
            if (element < minimum) {
                minimum2 = minimum;
                minimum = element;
            }
        }
        stringBuilder.append("Two minimums : " + minimum + " и " + minimum2);
        return stringBuilder;
    }

    //2.4.5 Сжать массив
    public static StringBuilder squeeze(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 25) {
                counter++;
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - counter] = 0;
                i--;
            }
        }
        System.out.print("Your squeezed array : ");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(i + " ");
        }
        return stringBuilder;
    }

    //2.4.6 Сумма цифр массива
    public static StringBuilder sumNumbersArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;

        for (int element : array) {
            if (element > 9) {
                int first = element / 10;
                int second = element % 10;
                if (first <= 9) {
                    sum += first + second;
                }
                if (first > 9) {
                    int x = first / 10;
                    int y = first % 10;
                    sum += x + y + second;
                }
            } else {
                sum += element;
            }
        }
        stringBuilder.append(sum);
        return stringBuilder;
    }
}




