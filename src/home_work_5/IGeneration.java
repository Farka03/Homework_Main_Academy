package home_work_5;

import java.io.IOException;

public interface IGeneration {
    //Данный метод генерирует рандомную строку, которая неважно из чего состоит
    StringBuilder allElements();
    //Данный метод генерирует рандомную строку, которая состоит из русских букв
    StringBuilder russianLetters();
    //Данный метод генерирует строку, которую получаем из списка имен
    StringBuilder nameReally();
    //Данный метод генерирует рандомную строку, которая генерируется из файла
    StringBuilder fromFile() throws IOException;
}
