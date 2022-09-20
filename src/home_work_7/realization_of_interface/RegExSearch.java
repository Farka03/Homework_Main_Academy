package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;
import home_work_7.RefactorToString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    //Данный метод ищет слова с учётом регистра
    @Override
    public long search(String text, String word) {
        String clearText = RefactorToString.deleteSomeSymb(RefactorToString.convertToString(text));
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
        Matcher matcher = pattern.matcher(clearText);
        return matcher.results().count(); //Возвращаем количество
    }
}
