package home_work_7.work_with_collections;

import java.util.Comparator;
import java.util.Map;

public class ComparatorForFindTopN implements Comparator<Map.Entry<String, Integer>> {
    //Данный метод сравнивает значения
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
