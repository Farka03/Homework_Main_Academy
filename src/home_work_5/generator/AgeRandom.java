package home_work_5.generator;

import java.util.Random;
import java.util.Scanner;

public class AgeRandom {

    //Данный метод генерирует возраст от 1 до 15 лет
    public int getAge(int age) {
        if (age == 0) {
            Random random = new Random();
            age = 1 + random.nextInt(15);
            return age;
        } else if (age < 1 || age > 15) {
            System.out.println("Please, enter your age below 15");
            Scanner scanner = new Scanner(System.in);
            age = scanner.nextInt();
            return age;
        } else {
            return age;
        }
    }
}
