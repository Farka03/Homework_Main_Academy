package home_work_7.realization_of_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchEnginePunctuationNormalizerTest {
    SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(new EasySearch());

    @Test
    public void firstSearch() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer.search("Ку-ку", "ку"));
    }

    @Test
    public void secondSearch() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer.search("10-ыми", "10"));
    }

    @Test
    public void thirdSearch() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer.search("раз, два, три, четыре", "четыре"));
    }

    @Test
    public void fourthSearch() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer.search("пока, другхороший", "пока"));
    }

    @Test
    public void fifthSearch() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer.search("пока! другхороший", "другхороший"));
    }

    @Test
    public void sixthSearch() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer.search("десять это 10", "Десять"));
    }

    @Test
    public void seventhSearch() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer.search("Привет ДруГ", "друг"));
    }

    @Test
    public void eighthSearch() {
        Assertions.assertEquals(0, searchEnginePunctuationNormalizer.search("Вечерний зной жара июнь", "зн"));
    }

    @Test
    public void ninthSearch() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer.search("Отец отцу вроде как отец", "Отец"));
    }

    @Test
    public void tenthSearch() {
        Assertions.assertEquals(1, searchEnginePunctuationNormalizer.search("Привет дружаня!. Соскучился?", "дружаня"));
    }
}