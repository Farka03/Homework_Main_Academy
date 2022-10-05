package home_work_7;

import home_work_7.realization_of_interface.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchFileTest {
    @Test
    public void run1() {
        File currentResult = new File("Final");
        if (currentResult.exists()) {
            Assertions.assertTrue(currentResult.delete());
        }
        File f = new File("src/home_work_7/file_text/First.txt");
        WordSearchFile wordSearchFile = new WordSearchFile(new EasySearch(), currentResult, f, "дерево");
        wordSearchFile.run();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(currentResult)) {
            int temp;
            while ((temp = fileReader.read()) != -1) {
                stringBuilder.append(Character.toChars(temp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("First.txt : дерево - 1\n", stringBuilder.toString());
    }

    @Test
    public void run2() {
        File currentResult = new File("Final");
        if (currentResult.exists()) {
            Assertions.assertTrue(currentResult.delete());
        }
        File f = new File("src/home_work_7/file_text/Second.txt");
        WordSearchFile booksThread = new WordSearchFile(new EasySearch(), currentResult, f, "корабль");
        booksThread.run();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(currentResult)) {
            int temp;
            while ((temp = fileReader.read()) != -1) {
                stringBuilder.append(Character.toChars(temp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("Second.txt : корабль - 1\n", stringBuilder.toString());
    }

    @Test
    public void run3() {
        File currentResult = new File("Final");
        if (currentResult.exists()) {
            Assertions.assertTrue(currentResult.delete());
        }
        File f = new File("src/home_work_7/file_text/Third.txt");
        WordSearchFile booksThread = new WordSearchFile(new EasySearch(), currentResult, f, "зуб");
        booksThread.run();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(currentResult)) {
            int temp;
            while ((temp = fileReader.read()) != -1) {
                stringBuilder.append(Character.toChars(temp));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("Third.txt : зуб - 2\n", stringBuilder.toString());
    }

}