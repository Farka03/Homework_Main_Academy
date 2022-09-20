package home_work_5.generator;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.io.IOException;

public class GeneratorAnimalPerson {
    //Создаем объекты наших генераторов и рандомного пароля и рандомного возраста-
    GeneratorPersonName generatorPersonName = new GeneratorPersonName();
    GeneratorAnimalNick generatorAnimalNick = new GeneratorAnimalNick();
    GeneratorPersonNick generatorPersonNick = new GeneratorPersonNick();
    PasswordRandom passwordRandom = new PasswordRandom();
    AgeRandom ageRandom = new AgeRandom();
    //Данный метод возвращает Person
    public Person getPerson() throws IOException {
        return new Person(generatorPersonNick.fromFile(), passwordRandom.getPassword(null), generatorPersonName.nameReally());
    }

    //Данный метод возвращает Animal
    public Animal getAnimal() {
        return new Animal(ageRandom.getAge(0), generatorAnimalNick.nameReally());
    }
}
