package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }
    //Данный метод возвращает сколько раз использовалось слово в тексе
    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text, word);
    }
    //Данный метод приводит все слова к единому падежу
    public long searchCaseNormalizer(String text, String word, int caseWord) {
        long result;
        char[] temp = word.toCharArray();

        if (caseWord == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            if (temp[word.length() - 1] == 'a' || temp[word.length() - 1] == 'е' || temp[word.length() - 1] == 'ю' || temp[word.length() - 1] == 'и'
                    || temp[word.length() - 1] == 'у' || temp[word.length() - 1] == 'ы' || temp[word.length() - 1] == 'я') {
                for (int i = 0; i < word.length() - 1; i++) {
                    stringBuilder.append(temp[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    stringBuilder.append(temp[i]);
                }
            }
            long firstCase = search(text, stringBuilder + "а");
            long secondCase = search(text, stringBuilder + "e");
            long thirdCase = search(text, stringBuilder + "ю");
            long fourthCase = search(text, stringBuilder + "и");
            long fifthCase = search(text, stringBuilder + "у");
            long sixthCase = search(text, stringBuilder + "ы");
            long seventhCase = search(text, stringBuilder + "я");
            long eighthCase = search(text, stringBuilder + "ой");
            long ninthCase = search(text, stringBuilder + "ей");
            result = firstCase + secondCase + thirdCase + fourthCase + fifthCase + sixthCase + seventhCase + eighthCase + ninthCase;
            return result;
        } else if (caseWord == 2) {
            StringBuilder stringBuilder = new StringBuilder();
            Set<Character> firstStream = Stream.of('ф', 'ч', 'с', 'к', 'м', 'п', 'н', 'р', 'т', 'г', 'ш', 'л', 'б', 'д', 'щ', 'з', 'ж', 'х', 'ъ', 'ь').collect(Collectors.toSet());
            Set<Character> secondStream = Stream.of('о', 'е', 'а', 'я', 'у', 'ю', 'и').collect(Collectors.toSet());
            char[] wordToSymbols = word.toCharArray();
            char lastSymbol = wordToSymbols[word.length() - 1];
            if (firstStream.contains(lastSymbol)) {
                stringBuilder.append(word);
            } else if (secondStream.contains(lastSymbol)) {
                for (int i = 0; i < word.length() - 1; i++) {
                    stringBuilder.append(wordToSymbols[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    stringBuilder.append(wordToSymbols[i]);
                }
            }
            String toStr = stringBuilder.toString();
            long firstCase = search(text, toStr);
            long secondCase = search(text, stringBuilder + "а");
            long thirdCase = search(text, stringBuilder + "е");
            long fourthCase = search(text, stringBuilder + "ю");
            long fifthCase = search(text, stringBuilder + "и");
            long sixthCase = search(text, stringBuilder + "у");
            long seventhCase = search(text, stringBuilder + "ы");
            long eighthCase = search(text, stringBuilder + "я");
            long ninthCase = search(text, stringBuilder + "ом");
            long tenthCase = search(text, stringBuilder + "ем");
            result = firstCase + secondCase + thirdCase + fourthCase + fifthCase + sixthCase + seventhCase + eighthCase + ninthCase + tenthCase;
            return result;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            char[] wordToChar = word.toCharArray();
            char lastSymbol = wordToChar[word.length() - 1];
            if (lastSymbol == 'ь' || lastSymbol == 'и') {
                for (int i = 0; i < word.length() - 1; i++) {
                    stringBuilder.append(wordToChar[i]);
                }
            } else {
                for (int i = 0; i < word.length() - 2; i++) {
                    stringBuilder.append(wordToChar[i]);
                }
            }
            long firstCase = search(text, stringBuilder + "и");
            long secondCase = search(text, stringBuilder + "ь");
            long thirdCase = search(text, stringBuilder + "ью");
            result = firstCase + secondCase + thirdCase;
            return result;
        }
    }
}
