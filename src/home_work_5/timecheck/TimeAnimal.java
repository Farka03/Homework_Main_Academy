package home_work_5.timecheck;

import home_work_5.IteratorTime;
import home_work_5.dto.Animal;
import home_work_5.sortCollection.SortCollectionAnimal;

import java.util.Collection;

public class TimeAnimal {
    SortCollectionAnimal sortCollectionAnimal = new SortCollectionAnimal();
    IteratorTime iterators = new IteratorTime();
    //Данный метод занимается замеркой времени
    public void animalTime(Collection<Animal> collection) {
        long start1 = System.currentTimeMillis();
        sortCollectionAnimal.sortAnimal(collection);
        long finish1 = System.currentTimeMillis();
        System.out.println("The operation sortAnimal took time : " + (finish1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        sortCollectionAnimal.sortHandAnimal(collection);
        long finish2 = System.currentTimeMillis();
        System.out.println("The operation sortHandAnimal took time : " + (finish2 - start2) + " ms");

        long start3 = System.currentTimeMillis();
        iterators.iteratorTimeCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("The operation iteratorTimeCollection took time : " + (finish3 - start3) + " ms");

        long start4 = System.currentTimeMillis();
        iterators.timeCollectionFor(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("The operation timeCollectionFor took time : " + (finish4 - start4) + " мс");

        long start5 = System.currentTimeMillis();
        iterators.iteratorDelCollection(collection);
        long finish5 = System.currentTimeMillis();
        System.out.println("The operation iteratorDelCollection took time " + (finish5 - start5) + " мс");
    }
}
