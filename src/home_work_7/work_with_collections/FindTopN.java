package home_work_7.work_with_collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTopN {
    private static final List<Map.Entry<String, Integer>> finalRes = new ArrayList<>();
    //Данный метод использует маппу, где ключ - слово, значение - количество его повторений
    private static void wordCount(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        ComparatorForFindTopN comparatorForFindTopN = new ComparatorForFindTopN();
        Map<String, Integer> mapWords = new HashMap<>();

        try (FileReader fileReader = new FileReader(str)) {
            int temp;
            while ((temp = fileReader.read()) != -1) {
                String word = "";
                if ((temp == 45 && stringBuilder.length() > 0) || (temp >= 1040 && temp <= 1103) || (temp >= 48 && temp <= 57)) {
                    stringBuilder.append(Character.toString(temp));
                } else {
                    word = stringBuilder.toString();
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (word.length() > 0) {
                    if (mapWords.containsKey(word)) {
                        int counter = mapWords.get(word) + 1;
                        mapWords.put(word, counter);
                    } else {
                        mapWords.put(word, 1);
                    }
                }
            }
            //Обрабатываем событие
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Map.Entry<String, Integer>> arrayList = new ArrayList<>(mapWords.entrySet());
        arrayList.sort(comparatorForFindTopN);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            finalRes.add(arrayList.get(i));
        }
    }
    //Данный метод выводит в консоль топ N
    public static void topN(int n, String text) {
        wordCount(text);
        for (int i = 0; i < n; i++) {
            System.out.println(finalRes.get(i)); //Выводим результат в консоль
        }
    }
}
