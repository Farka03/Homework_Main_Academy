package home_work_5.timecheck;

import home_work_5.IteratorTime;
import home_work_5.dto.Person;
import home_work_5.sortCollection.SortCollectionPerson;

import java.util.Collection;

public class TimePerson {
    SortCollectionPerson sortCollectionPerson = new SortCollectionPerson();
    IteratorTime iteratorCollection = new IteratorTime();

    /**
     * Тестируем Person
     */
    public void personTime(Collection<Person> collection) {
        long start1 = System.currentTimeMillis();
        sortCollectionPerson.sortPerson(collection);
        long finish1 = System.currentTimeMillis();
        System.out.println("The operation getPersonSort took time : " + (finish1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        sortCollectionPerson.sortHandPerson(collection);
        long finish2 = System.currentTimeMillis();
        System.out.println("The operation getMySortPerson took time : " + (finish2 - start2) + " ms");

        long start3 = System.currentTimeMillis();
        iteratorCollection.iteratorTimeCollection(collection);
        long finish3 = System.currentTimeMillis();
        System.out.println("The operation iteratorTimeCollection took time : " + (finish3 - start3) + " ms");

        long start4 = System.currentTimeMillis();
        iteratorCollection.timeCollectionFor(collection);
        long finish4 = System.currentTimeMillis();
        System.out.println("The operation timeCollectionFor took time :" + (finish4 - start4) + " ms");

        long start5 = System.currentTimeMillis();
        iteratorCollection.iteratorDelCollection(collection);
        long finish5 = System.currentTimeMillis();
        System.out.println("The operation iteratorDelCollection took time :  " + (finish5 - start5) + " ms");
    }
}

