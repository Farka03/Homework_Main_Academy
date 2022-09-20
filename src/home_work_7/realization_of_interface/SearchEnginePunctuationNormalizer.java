package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.iSearchEngine = searchEngine;
    }
    //Данный метод возвращает сколько раз использовалось слово
    @Override
    public long search(String text, String word) {
        String string = deleteSymb(convert(text));
        return iSearchEngine.search(string, word);
    }
    //Данный метод преобразует файл в строку
    public static String convert(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(text);
        if (file.exists() && !file.isDirectory()) {
            try (FileReader fileReader = new FileReader(text)) {
                int temp;
                while ((temp = fileReader.read()) != -1) {
                    stringBuilder.append(Character.toChars(temp));
                }
                return stringBuilder.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return text;
        }
    }
    //Данный метод удаляет из строки все символы кроме цифр, букв и "-"
    public static String deleteSymb(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("-")) {
                char[] temp = arr[i].toCharArray();
                StringBuilder strBuild = new StringBuilder();
                for (char t : temp) {
                    if (t != 45 || strBuild.length() != 0) {
                        strBuild.append(t);
                    }
                }
                arr[i] = strBuild.toString();
            }
        }
        for (String elem : arr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            char[] temp = elem.toCharArray();
            for (char t : temp) {
                if (t == 45 || (t >= 1040 && t <= 1103) || (t >= 48 && t <= 57)) {
                    stringBuilder.append(Character.toChars(t));
                } else {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
