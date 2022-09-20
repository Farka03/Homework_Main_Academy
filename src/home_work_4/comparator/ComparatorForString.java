package home_work_4.comparator;

import java.util.Comparator;

public class ComparatorForString implements Comparator<String> {

    //Компаратор для стринга, где происходит сравнение
    @Override
    public int compare(String o1, String o2) {
        char[] arrayOne = o1.toCharArray();
        char[] arrayTwo = o2.toCharArray();
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > arrayTwo[i]) {
                return 1;
            } else if (arrayTwo[i] > arrayOne[i]) {
                return -1;
            }
        }
        return 0;
    }
}
