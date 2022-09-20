package home_work_2.utils;

public class SortsUtils {
    public static void main(String[] args) {
        int[] array1 = new int[]{32, 10, 55, 73, 81, 96, 3, 47};
        //Ответ для пузырьковой сортировки 4.1.1
        System.out.print("Array before sort : ");
        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();
        bubble(array1);
        System.out.println("Bubble sort array : " + arrayBubbleToString(array1));

        int[] array2 = new int[]{40, 12, 51, 36, 18, 30, 21, 55};
        //Ответ для шейкерной сортировки 4.1.2
        System.out.print("Array before sort : ");
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
        shake(array2);
        System.out.println("Shaker sort array : " + arrayShakerToString(array2));
    }

    /**
     * Пузырьковая сортировка, при которой перебирается массив и сравниваются элементы, пока они не займут свои позиции
     * и не будут идти по возрастанию. Сортировка идет слева неправо и потом возвращается после последнего элемента
     * сразу к первому и занов
     */
    public static void bubble(int[] arr) {
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sort = false;
                }
            }
        }
    }

    public static String arrayBubbleToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    /**
     * Шейкерная сортировка по своей сути очень похожа на пузырьковую, однако если в пузырьковой мы проходились
     * по массиву слево направо, то в шейкерном мы проходимся слево направо и потом справа налево, а не возвращаемся
     * к началу массива
     */
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int count = 1;

        while (count > 0) {
            count = 0;
            for (int i = left; i < right; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count = 1;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count = 1;
                }
            }
            left++;
        }
    }

    public static String arrayShakerToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
