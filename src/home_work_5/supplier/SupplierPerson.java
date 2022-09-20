package home_work_5.supplier;

import home_work_5.dto.Person;
import home_work_5.generator.GeneratorPersonName;
import home_work_5.generator.GeneratorPersonNick;
import home_work_5.generator.PasswordRandom;

import java.io.IOException;
import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {
    GeneratorPersonName generatorPersonName = new GeneratorPersonName();
    GeneratorPersonNick generatorPersonNick = new GeneratorPersonNick();
    PasswordRandom passwordRandom = new PasswordRandom();

    /**
     * @return Возвращаем Person
     */
    @Override
    public Person get() {
        try {
            return new Person(generatorPersonNick.fromFile(), passwordRandom.getPassword(null), generatorPersonName.nameReally());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
