package home_work_7.work_with_collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AllWordsSet {
    //Данный метод в тексте все использованные слова и помещает их в коллекцию Set
    public static Set<String> individualWord() {
        String material = "src/home_work_7/ВойнаИМир.txt";
        Set<String> words = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(material)) {
            int temp;
            while ((temp = fileReader.read()) != -1) {
                if ((temp == 45 && stringBuilder.length() > 0) || (temp >= 1040 && temp <= 1103) || (temp >= 48 && temp <= 57)) {
                    stringBuilder.append(Character.toString(temp));
                } else if (stringBuilder.length() > 0) {
                    words.add(stringBuilder.toString());
                    stringBuilder.delete(0, stringBuilder.length());
                }
            }
            //Всю обработку должны обязательно обработать
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }
}
