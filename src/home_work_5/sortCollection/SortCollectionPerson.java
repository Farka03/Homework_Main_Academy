package home_work_5.sortCollection;

import home_work_5.comparator.ComparatorPersonLengthPassword;
import home_work_5.dto.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SortCollectionPerson {
    //Данный метод занимается сортировкой коллекции для Person
    public void sortPerson(Collection<Person> collection) {
        List<Person> collectionListPerson = new ArrayList<>(collection);
        collectionListPerson.sort(new ComparatorPersonLengthPassword());
    }
    //Данный метод занимается сортировкой коллекции для Person
    public void sortHandPerson(Collection<Person> collection) {
        List<Person> listPerson = new ArrayList<>(collection);
        List<Person> collectionListPerson = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            for (int j = collection.size() - 1; j > i; j--) {
                if (listPerson.get(i).getPassword().length() > listPerson.get(j).getPassword().length()) {
                    collectionListPerson.add(listPerson.get(j));
                    collectionListPerson.set(collectionListPerson.size() - 1, listPerson.get(i));
                    listPerson.set(j, listPerson.get(i));
                    listPerson.set(i, collectionListPerson.get(collectionListPerson.size() - 1));
                }
            }
        }
    }
}
