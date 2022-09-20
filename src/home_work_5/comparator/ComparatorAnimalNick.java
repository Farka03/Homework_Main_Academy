package home_work_5.comparator;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAnimalNick implements Comparator<Animal> {
    //Данный метод сравнивает клички по алфавиту
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
