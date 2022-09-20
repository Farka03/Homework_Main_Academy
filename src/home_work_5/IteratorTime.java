package home_work_5;

import java.util.Collection;
import java.util.Iterator;

public class IteratorTime {
    //Данный метод измеряет скорость итерирования с помощью Итератора
    public <T> void iteratorTimeCollection(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            itr.next();
        }
    }

    //Данный метод измеряет скорость итерирования с помощью For
    public <T> void timeCollectionFor(Collection<T> collection) {
        for (int i = 0; i < collection.size(); ) {
            i++;
        }
    }

    //Данный метод удаляет элементы из коллекции с помощью Итератора
    public <T> void iteratorDelCollection(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
    }
}
