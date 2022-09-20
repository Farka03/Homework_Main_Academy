package home_work_5.generator;

import java.io.*;
import java.util.Random;

public class GeneratorPersonNick extends GeneratorPersonName {
    //Данный метод генерирует строку, не важно из чего состояющую
    @Override
    public StringBuilder allElements() {
        return super.allElements();
    }

    //Данный метод генерирует строку из английских букв
    public StringBuilder englishLetters() {
        StringBuilder stringBuilderNickEnglish = new StringBuilder();
        for (int i = 0; i < getLengthString(); i++) {
            stringBuilderNickEnglish.append((char) getRandomEnglishLettersNumber());
        }
        return stringBuilderNickEnglish;
    }

    //Данный метод генерирует рандомный псевдоним из списка
    @Override
    public StringBuilder fromFile() throws IOException {
        File file = new File("PersonNick.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("User1\nUser2\nUser3\nUser4\nUser5\nUser6\nUser7\nUser8\nUser9\nUser10");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = bufferedReader.readLine();
        }
        String name = strings[getRandomRussianRealName()];
        return new StringBuilder(name);
    }

    //Данный метод генерирует рандомное число из английского алфавита для символа
    private int getRandomEnglishLettersNumber() {
        Random random = new Random();
        return 97 + random.nextInt(25);
    }
}
