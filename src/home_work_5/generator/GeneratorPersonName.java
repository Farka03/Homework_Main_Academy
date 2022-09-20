package home_work_5.generator;

import home_work_5.IGeneration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorPersonName implements IGeneration {
    //Данный метод генерирует строку, не важно из чего состояющую
    @Override
    public StringBuilder allElements() {
        StringBuilder stringBuilderNickAll = new StringBuilder();
        for (int i = 0; i < getLengthString(); i++) {
            stringBuilderNickAll.append((char) getRandomAllNumbers());
        }
        return stringBuilderNickAll;
    }

    //Данный метод генерирует строку из русских букв
    @Override
    public StringBuilder russianLetters() {
        StringBuilder stringBuilderNickRussian = new StringBuilder();
        for (int i = 0; i < getLengthString(); i++) {
            stringBuilderNickRussian.append((char) getRandomRussianLettersNumber());
        }
        return stringBuilderNickRussian;
    }

    //Данный метод генерирует рандомное имя из списка
    @Override
    public StringBuilder nameReally() {
        List<StringBuilder> listName = new ArrayList<>();
        listName.add(new StringBuilder("Никита"));
        listName.add(new StringBuilder("Егор"));
        listName.add(new StringBuilder("Игорь"));
        listName.add(new StringBuilder("Василий"));
        listName.add(new StringBuilder("Алексей"));
        listName.add(new StringBuilder("Павел"));
        listName.add(new StringBuilder("Роберт"));
        listName.add(new StringBuilder("Сергей"));
        listName.add(new StringBuilder("Георгий"));
        listName.add(new StringBuilder("Владислав"));
        return listName.get(getRandomRussianRealName());
    }

    //Данный метод генерирует рандомное имя из файла
    @Override
    public StringBuilder fromFile() throws IOException {
        File file = new File("PersonName.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Никита\nЕгор\nИгорь\nВасилий\nАлексей\nПавел\nРоберт\nСергей\nГеоргий\nВладислав");
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

    //Данный метод генерирует рандомное число для символа
    private int getRandomAllNumbers() {
        Random random = new Random();
        return random.nextInt();
    }

    //Данный метод генерирует рандомное число из русского алфавита для символа
    private int getRandomRussianLettersNumber() {
        Random random = new Random();
        return 1072 + random.nextInt(33);
    }

    //Данный метод генерирует рандомное число из списка для имени
    public int getRandomRussianRealName() {
        Random random = new Random();
        return random.nextInt(10);
    }

    //Данный метод генерирует рандомное число для длинной строки
    public int getLengthString() {
        Random random = new Random();
        return 1 + random.nextInt(10);
    }
}
