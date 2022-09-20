package home_work_1.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordOrSymbolTest {

    @Test
    void wordOrSym() {
        assertTrue(WordOrSymbol.checkAscii('h'));
    }
}