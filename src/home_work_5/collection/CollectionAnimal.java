package home_work_5.collection;

import home_work_5.dto.Animal;
import home_work_5.supplier.SupplierAnimal;

import java.util.Collection;

public class CollectionAnimal {
    //Данный метод заполняет Collection и показывает время, за которое заполнилось, для Animal
    public void addAnimalToColl(Collection<Animal> collection) {
        for (int i = 0; i < 10_000; i++) {
            SupplierAnimal supplierAnimal=new SupplierAnimal();
            collection.add(supplierAnimal.get());
        }
    }
}
