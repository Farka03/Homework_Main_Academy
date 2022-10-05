package home_work_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WordSearchFile implements Runnable {
    private final File file;
    private final File fileName;
    private final String word;

    private final ISearchEngine iSearchEngine;
    //Конструктор
    public WordSearchFile(ISearchEngine iSearchEngine, File file, File nameFile, String word) {
        this.file = file;
        this.fileName = nameFile;
        this.word = word;
        this.iSearchEngine = iSearchEngine;
    }
    //Для нашего ответа и теста
    @Override
    public void run() {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            long cast = iSearchEngine.search(RefactorToString.convert(fileName.toString()), word);
            fileWriter.write(fileName.getName() + " : " + word + " - " + cast + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

