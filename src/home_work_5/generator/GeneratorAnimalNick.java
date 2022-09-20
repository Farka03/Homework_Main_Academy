package home_work_5.generator;

import home_work_5.IGeneration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GeneratorAnimalNick extends GeneratorPersonName implements IGeneration {
    //Данный метод генерирует строку, не важно из чего состояющую
    @Override
    public StringBuilder allElements() {
        return super.allElements();
    }

    //Данный метод генерирует строку из русских букв
    @Override
    public StringBuilder russianLetters() {
        return super.russianLetters();
    }

    //Данный метод генерирует рандомную кличку из списка
    @Override
    public StringBuilder nameReally() {
        List<StringBuilder> listName = new ArrayList<>();
        listName.add(new StringBuilder("Лопольд"));
        listName.add(new StringBuilder("Шарик"));
        listName.add(new StringBuilder("Петька"));
        listName.add(new StringBuilder("Барсик"));
        listName.add(new StringBuilder("Бэн"));
        listName.add(new StringBuilder("Барни"));
        listName.add(new StringBuilder("Мухтар"));
        listName.add(new StringBuilder("Стефан"));
        listName.add(new StringBuilder("Рэдик"));
        listName.add(new StringBuilder("Коля"));
        return listName.get(getRandomRussianRealName());
    }

    //Данный метод генерирует рандомную кличку из файла
    public StringBuilder fromFile() throws IOException {
        File file = new File("AnimalNick.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Леопольд\nШарик\nПетька\nБарсик\nБэн\nБарни\nМухтар\nСтефан\nРэдик\nКоля");
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
}
