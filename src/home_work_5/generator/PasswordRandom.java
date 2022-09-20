package home_work_5.generator;

import java.util.Random;
import java.util.Scanner;

public class PasswordRandom {
    //Данный метод генерирует рандомный пароль от 5 до 10 символов
    public StringBuilder getPassword(StringBuilder password) {
        if (password == null) {
            password = new StringBuilder();
            Random random = new Random();
            int count = 5 + random.nextInt(5);
            for (int i = 0; i < count; i++) {
                int symbol = random.nextInt(10);
                password.append(symbol);
            }
            return password;
        } else if (password.length() < 5 || password.length() > 10) {
            System.out.println("Please, enter 5 or 10 symbols");
            Scanner scanner = new Scanner(System.in);
            password = new StringBuilder(scanner.nextLine());
            return password;
        } else {
            return password;
        }
    }
}
