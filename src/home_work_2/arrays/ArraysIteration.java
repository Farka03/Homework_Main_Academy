package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole(); //Изначальный массив

        //Тут мы выводим в консоль все касаемо вывода всех чисел
        int[] cont1 = doWhileCycle(array);
        System.out.println(Arrays.toString(cont1));

        int[] cont2 = whileCycle(array);
        System.out.println(Arrays.toString(cont2));

        int[] cont3 = forCycle(array);
        System.out.println(Arrays.toString(cont3));

        int[] cont4 = forEachCycle(array);
        System.out.println(Arrays.toString(cont4));

        //Тут мы выводим в консоль все касаемо вывода каждого второго элемента
        int[] cont5 = doWhileCycleSecond(array);
        System.out.println(Arrays.toString(cont5));

        int[] cont6 = whileCycleSecond(array);
        System.out.println(Arrays.toString(cont6));

        int[] cont7 = forCycleSecond(array);
        System.out.println(Arrays.toString(cont7));

        int[] cont8 = forEachCycleSecond(array);
        System.out.println(Arrays.toString(cont8));

        //Тут мы выводим в консоль все касаемо вывода в обратно порядке
        int[] cont9 = doWhileCycleReverse(array);
        System.out.println(Arrays.toString(cont9));

        int[] cont10 = whileCycleReverse(array);
        System.out.println(Arrays.toString(cont10));

        int[] cont11 = forCycleReverse(array);
        System.out.println(Arrays.toString(cont11));

        int[] cont12 = forEachCycleReverse(array);
        System.out.println(Arrays.toString(cont12));
    }

    //2.2.1, тут мы выводим все элементы в консоль
    public static int[] doWhileCycle(int[] array1) {
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("Ops, zero : " + array1[i]);
            }
            System.out.println(array1[i]);
            i++;
        } while (i < array1.length);
        return array1;
    }

    public static int[] whileCycle(int[] array2) {
        int i = 0;
        while (i < array2.length) {
            if (i == 0) {
                System.out.println("Ops, zero : " + array2[i]);
            }
            System.out.println(array2[i]);
            i++;
        }
        return array2;
    }

    public static int[] forCycle(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (i == 0) {
                System.out.println("Ops, zero : " + array3[i]);
            }
            System.out.println(array3[i]);
        }
        return array3;
    }

    public static int[] forEachCycle(int[] array4) {
        for (int element : array4) {
            System.out.print(element);
        }
        return array4;
    }

    //2.2.2, тут мы выводим каждый второй элемент в консоль
    public static int[] doWhileCycleSecond(int[] array5) {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.print(array5[i]);
            }
            i++;
        } while (i < array5.length);
        return array5;
    }

    public static int[] whileCycleSecond(int[] array6) {
        int i = 0;
        while (i < array6.length) {
            if (i % 2 == 0) {
                System.out.print(array6[i]);
            }
            i++;
        }
        return array6;
    }

    public static int[] forCycleSecond(int[] array7) {
        for (int i = 1; i < array7.length; i += 2) {
            if (i == 1) {
                System.out.print(array7[i]);
            } else {
                System.out.print(array7[i]);
            }
            i += 2;
        }
        return array7;
    }

    public static int[] forEachCycleSecond(int[] array8) {
        int i = 1;
        for (int element : array8) {
            if (i % 2 == 0) {
                System.out.print(element);
            }
            i++;
        }
        return array8;
    }

    //2.2.3, тут мы выводим все элементы массивы в обратном порядке
    public static int[] doWhileCycleReverse(int[] array9) {
        int i = array9.length - 1;
        do {
            System.out.println(array9[i]);
            i--;
        } while (i >= 0);
        return array9;
    }

    public static int[] whileCycleReverse(int[] array10) {
        int i = array10.length - 1;
        while (i >= 0) {
            System.out.println(array10[i]);
            i--;
        }
        return array10;
    }

    public static int[] forCycleReverse(int[] array11) {
        for (int i = array11.length - 1; i >= 0; i--) {
            if (i == array11.length - 1) {
                System.out.print(array11[i]);
            } else {
                System.out.print(array11[i]);
            }
        }
        return array11;
    }

    public static int[] forEachCycleReverse(int[] array12) {
        int[] array1 = new int[array12.length];
        int i = array12.length - 1;
        for (int element : array12) {
            array1[i] = element;
            i--;
        }
        for (int element : array1) {
            System.out.print(element + " ");
        }
        return array12;
    }
}
