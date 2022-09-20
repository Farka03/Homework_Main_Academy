package home_work_4.comparator;

import java.util.Comparator;

public class ComparatorForData<T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2); //Если значение o1 больше чем значение o2, то возвращаем единицу, если нет,
        //то минус один, если равны между собой o1 и o2, то ноль
    }
}
