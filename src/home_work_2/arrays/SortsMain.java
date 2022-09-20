package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

//Для этого задания используем ранее созданные классы и методы, в которых прописана вся логика и просто вызываем их.
public class SortsMain {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6};
        SortsUtils.bubble(firstArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(firstArray));
        int[] firstArray2 = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(firstArray2);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(firstArray2));

        int[] secondArray = {1, 1, 1, 1};
        SortsUtils.bubble(secondArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(secondArray));
        int[] secondArray2 = {1, 1, 1, 1};
        SortsUtils.shake(secondArray2);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(secondArray2));

        int[] thirdArray = {9, 1, 5, 99, 9, 9};
        SortsUtils.bubble(thirdArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(thirdArray));
        int[] thirdArray2 = {9, 1, 5, 99, 9, 9};
        SortsUtils.shake(thirdArray2);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(thirdArray2));

        int[] fourthArray = {};
        SortsUtils.bubble(fourthArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(fourthArray));
        int[] fourthArray2 = {};
        SortsUtils.shake(fourthArray2);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(fourthArray2));

        int[] fifthArray = {6, 5, 4, 3, 2, 1};
        SortsUtils.bubble(fifthArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(fifthArray));
        int[] fifthArray2 = {6, 5, 4, 3, 2, 1};
        SortsUtils.shake(fifthArray2);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(fifthArray2));

        int[] sixthArray = ArraysUtils.arrayFromConsole();
        SortsUtils.bubble(sixthArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(sixthArray));

        int[] seventhArray = ArraysUtils.arrayFromConsole();
        SortsUtils.shake(seventhArray);
        System.out.println("Shaker sort array : " + SortsUtils.arrayShakerToString(seventhArray));

        int[] eighthArray = ArraysUtils.arrayRandom(50, 100);
        SortsUtils.bubble(eighthArray);
        System.out.println("Bubble sort array : " + SortsUtils.arrayBubbleToString(eighthArray));

        int[] ninthArray = ArraysUtils.arrayRandom(50, 100);
        SortsUtils.shake(eighthArray);
        System.out.println("Shake sort array : " + SortsUtils.arrayShakerToString(ninthArray));
    }
}
