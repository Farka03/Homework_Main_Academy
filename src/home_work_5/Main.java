package home_work_5;

import home_work_5.collection.CollectionAnimal;
import home_work_5.collection.CollectionPerson;
import home_work_5.comparator.ComparatorAnimalAge;
import home_work_5.comparator.ComparatorAnimalNick;
import home_work_5.comparator.ComparatorPersonLengthPassword;
import home_work_5.comparator.ComparatorPersonNick;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.timecheck.TimeAnimal;
import home_work_5.timecheck.TimePerson;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Создаем все нужные объекты
        CollectionPerson createCollectionPerson = new CollectionPerson();
        CollectionAnimal createCollectionAnimal = new CollectionAnimal();
        TimePerson testPerson = new TimePerson();
        TimeAnimal testAnimal = new TimeAnimal();
        //Выводим результаты
        List<Person> personArrayList = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        createCollectionPerson.addPersonToColl(personArrayList);
        long finish1 = System.currentTimeMillis();
        System.out.println(personArrayList.size());
        System.out.println("The operation createCollectionPersonArrayList sortAnimal took time :  " + (finish1 - start1) + " ms");

        testPerson.personTime(personArrayList);

        List<Person> personLinkedList = new LinkedList<>();
        long start2 = System.currentTimeMillis();
        createCollectionPerson.addPersonToColl(personLinkedList);
        long finish2 = System.currentTimeMillis();
        System.out.println(personLinkedList.size());
        System.out.println("The operation createCollectionPersonLinkerList took time : " + (finish2 - start2) + " ms");

        testPerson.personTime(personLinkedList);

        Set<Person> personHashSet = new HashSet<>();
        long start3 = System.currentTimeMillis();
        createCollectionPerson.addPersonToColl(personHashSet);
        long finish3 = System.currentTimeMillis();
        System.out.println(personHashSet.size());
        System.out.println("The operation createCollectionPersonHashSet took time : " + (finish3 - start3) + " ms");

        testPerson.personTime(personHashSet);

        Set<Person> personTreeSet = new TreeSet<>(new ComparatorPersonLengthPassword());
        long start4 = System.currentTimeMillis();
        createCollectionPerson.addPersonToColl(personTreeSet);
        long finish4 = System.currentTimeMillis();
        System.out.println(personTreeSet.size());
        System.out.println("The operation createCollectionPersonTreeSet took time : " + (finish4 - start4) + " ms");

        testPerson.personTime(personTreeSet);

        List<Animal> animalArrayList = new ArrayList<>();
        long start5 = System.currentTimeMillis();
        createCollectionAnimal.addAnimalToColl(animalArrayList);
        long finish5 = System.currentTimeMillis();
        System.out.println(animalArrayList.size());
        System.out.println("The operation createCollectionAnimalArrayList took time : " + (finish5 - start5) + " ms");

        testAnimal.animalTime(animalArrayList);

        List<Animal> animalLinkedList = new LinkedList<>();
        long start6 = System.currentTimeMillis();
        createCollectionAnimal.addAnimalToColl(animalLinkedList);
        long finish6 = System.currentTimeMillis();
        System.out.println(animalLinkedList.size());
        System.out.println("The operation createCollectionAnimalLinkedList took time : " + (finish6 - start6) + " ms");

        testAnimal.animalTime(animalLinkedList);

        Set<Animal> animalHashSet = new HashSet<>();
        long start7 = System.currentTimeMillis();
        createCollectionAnimal.addAnimalToColl(animalHashSet);
        long finish7 = System.currentTimeMillis();
        System.out.println(animalHashSet.size());
        System.out.println("The operation createCollectionAnimalHashSet took time : " + (finish7 - start7) + " ms");

        testAnimal.animalTime(animalHashSet);

        Set<Animal> animalTreeSet = new TreeSet<>(new ComparatorAnimalAge());
        long start8 = System.currentTimeMillis();
        createCollectionAnimal.addAnimalToColl(animalTreeSet);
        long finish8 = System.currentTimeMillis();
        System.out.println(animalTreeSet.size());
        System.out.println("The operation createCollectionAnimalTreeSet took time : " + (finish8 - start8) + " ms");

        testAnimal.animalTime(animalTreeSet);
        //Двойная сортировка
        Comparator<Person> comparatorPersonLengthPasswordNick = new ComparatorPersonLengthPassword().thenComparing(new ComparatorPersonNick());
        Comparator<Animal> comparatorAnimalAgeNick = new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick());
    }
}
