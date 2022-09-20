package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortsUtilsTest {

    private final int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
    private final int[] array2 = new int[]{6, 5, 4, 3, 2, 1};
    private final int[] array3 = new int[]{1, 1, 1, 1};
    private final int[] array4 = new int[]{};
    private final int[] array5 = new int[]{100, 7, 4, 12, 53, 0, 1, 14};


    @Test
    public void bubble1() {
        SortsUtils.bubble(array1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array1);
        SortsUtils.bubble(array2);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array2);
        SortsUtils.bubble(array3);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, array3);
        SortsUtils.bubble(array4);
        Assertions.assertArrayEquals(new int[]{}, array4);
        SortsUtils.bubble(array5);
        Assertions.assertArrayEquals(new int[]{0, 1, 4, 7, 12, 14, 53, 100}, array5);
    }

    @Test
    public void shake() {
        SortsUtils.shake(array1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array1);
        SortsUtils.shake(array2);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array2);
        SortsUtils.shake(array3);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, array3);
        SortsUtils.shake(array4);
        Assertions.assertArrayEquals(new int[]{}, array4);
        SortsUtils.shake(array5);
        Assertions.assertArrayEquals(new int[]{0, 1, 4, 7, 12, 14, 53, 100}, array5);
    }
}
