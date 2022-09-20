package home_work_5.supplier;

import home_work_5.dto.Animal;
import home_work_5.generator.AgeRandom;
import home_work_5.generator.GeneratorAnimalNick;

import java.util.function.Supplier;

public class SupplierAnimal implements Supplier<Animal> {
    AgeRandom ageRandom = new AgeRandom();
    GeneratorAnimalNick generatorAnimalNick = new GeneratorAnimalNick();
    @Override
    public Animal get() {
        return new Animal(ageRandom.getAge(0), generatorAnimalNick.nameReally());
    }
}
