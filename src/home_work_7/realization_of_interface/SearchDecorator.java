package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;

public class SearchDecorator implements ISearchEngine {
    //Декоратор ищет данный без учета регистра
    private final ISearchEngine iSearchEngine;

    public SearchDecorator(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (iSearchEngine instanceof RegExSearch) {
            return iSearchEngine.search(text, word);
        } else {
            return iSearchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }
}
