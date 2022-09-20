package home_work_5.comparator;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalAge implements Comparator<Animal> {
    //Данный метод сравнивает возраст животных
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
