package home_work_2.loops;

public class Calculator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result;

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                result = array[i] * array[j];
                if (array[i] != 5) {
                    System.out.print(array[i] + " * " + array[j] + " = " + result + "    ");
                } else {
                    System.out.println(array[i] + " * " + array[j] + " = " + result);
                }
            }
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                result = array[i] * array[j];
                if (array[i] != 5) {
                    System.out.print(array[i] + " * " + array[j] + " = " + result + "    ");
                } else {
                    System.out.println(array[i] + " * " + array[j] + " = " + result);
                }
            }
        }
    }
}
