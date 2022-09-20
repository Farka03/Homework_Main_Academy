package home_work_4.comparator;

import java.util.Comparator;

public class ComparatorForInt implements Comparator<Integer> {

    //Компаратор для инта, где происходит сравнение
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 != null && o2 != null && o1 > o2) {
            return 1;
        } else if (o1 != null && o2 != null && o2 > o1) {
            return -1;
        } else {
            return 0;
        }
    }
}
