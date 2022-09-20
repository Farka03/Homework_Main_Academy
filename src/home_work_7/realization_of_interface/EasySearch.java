package home_work_7.realization_of_interface;

import home_work_7.ISearchEngine;

public class EasySearch implements ISearchEngine {
    //Ищем слова с учётом регистра
    @Override
    public long search(String text, String word) {
        int indexSearch = 0;
        int indexOf = text.indexOf(word, indexSearch);

        long counter = 0;

        while (indexOf != -1) {
            if (afterUnderstand(text, indexOf, word.length()) && beforeUnderstand(text, indexOf)) {
                counter++;
            }
            indexSearch = indexOf + word.length();
            indexOf = text.indexOf(word, indexSearch);
        }
        return counter;
    }

    private boolean afterUnderstand(String text, int indexOf, int length) {
        if (text.length() == indexOf + length) {
            return true;
        }
        char after = text.charAt(indexOf + length);
        return !(after >= 1040 && after <= 1103) && !(after >= 48 && after <= 57) && after != 45;
    }

    private boolean beforeUnderstand(String text, int indexOf) {
        if (indexOf == 0) {
            return true;
        }
        char before = text.charAt(indexOf - 1);
        return !(before >= 1040 && before <= 1103) && !(before >= 48 && before <= 57) && before != 45;
    }

}
