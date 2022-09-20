package home_work_5.collection;

import home_work_5.dto.Person;
import home_work_5.supplier.SupplierPerson;

import java.util.Collection;

public class CollectionPerson {
    //Данный метод заполняет Collection и показывает время, за которое заполнилось, для Person
    public void addPersonToColl(Collection<Person> collection) {
        for (int i = 0; i < 10_000; i++) {
            SupplierPerson supplierPerson = new SupplierPerson();
            collection.add(supplierPerson.get());
        }
    }
}
