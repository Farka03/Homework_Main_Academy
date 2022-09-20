package home_work_5.sortCollection;

import home_work_5.comparator.ComparatorAnimalAge;
import home_work_5.dto.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SortCollectionAnimal {
    //Данный метод занимается сортировкой коллекции для Animal
    public void sortAnimal(Collection<Animal> collection) {
        List<Animal> collectionListAnimal = new ArrayList<>(collection);
        collectionListAnimal.sort(new ComparatorAnimalAge());
    }
    //Данный метод занимается сортировкой коллекции
    public void sortHandAnimal(Collection<Animal> collection) {
        List<Animal> listAnimal = new ArrayList<>();
        List<Animal> collectionListAnimal = new ArrayList<>(collection);
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size() - 1; j > i; j--) {
                if (collectionListAnimal.get(i).getAge() > collectionListAnimal.get(j).getAge()) {
                    listAnimal.add(collectionListAnimal.get(j));
                    listAnimal.set(listAnimal.size() - 1, collectionListAnimal.get(i));
                    collectionListAnimal.set(j, collectionListAnimal.get(i));
                    collectionListAnimal.set(i, listAnimal.get(listAnimal.size() - 1));
                }
            }
        }
    }
}
