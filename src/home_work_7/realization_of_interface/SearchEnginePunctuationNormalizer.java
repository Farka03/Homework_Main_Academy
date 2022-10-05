package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;
import home_work_7.RefactorToString;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine iSearchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.iSearchEngine = searchEngine;
    }
    //Данный метод возвращает сколько раз использовалось слово
    @Override
    public long search(String text, String word) {
        String string = RefactorToString.deleteSomeSymb(RefactorToString.convert(text));
        return iSearchEngine.search(string, word);
    }

}
