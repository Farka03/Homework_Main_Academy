package home_work_7.realization_of_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchDecoratorTest {
    private final SearchDecorator searchDecorator = new SearchDecorator(new EasySearch());

    @Test
    public void firstSearch() {
        Assertions.assertEquals(0, searchDecorator.search("Ку-ку", "ку"));
    }

    @Test
    public void secondSearch() {
        Assertions.assertEquals(0, searchDecorator.search("10-ыми", "10"));
    }

    @Test
    public void thirdSearch() {
        Assertions.assertEquals(1, searchDecorator.search("раз, два, три, четыре", "четыре"));
    }

    @Test
    public void fourthSearch() {
        Assertions.assertEquals(1, searchDecorator.search("пока, другхороший", "пока"));
    }

    @Test
    public void fifthSearch() {
        Assertions.assertEquals(1, searchDecorator.search("пока! другхороший", "другхороший"));
    }

    @Test
    public void sixthSearch() {
        Assertions.assertEquals(1, searchDecorator.search("десять это 10", "Десять"));
    }

    @Test
    public void seventhSearch() {
        Assertions.assertEquals(1, searchDecorator.search("Привет ДруГ", "друг"));
    }

    @Test
    public void eighthSearch() {
        Assertions.assertEquals(0, searchDecorator.search("Вечерний зной жара июнь", "зн"));
    }

    @Test
    public void ninthSearch() {
        Assertions.assertEquals(2, searchDecorator.search("Отец отцу вроде как отец", "Отец"));
    }

    @Test
    public void tenthSearch() {
        Assertions.assertEquals(1, searchDecorator.search("Привет дружаня!. Соскучился?", "дружаня"));
    }
}