package home_work_7;

import home_work_7.realization_of_interface.EasySearch;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RefactorToString {
    //Данный метод конвертит файл в строку, понадобится для мейна
    public static String convert(String way) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(way);
        if (file.exists() && !file.isDirectory()) {
            try (FileReader fileReader = new FileReader(way)) {
                int temp;
                while ((temp = fileReader.read()) != -1) {
                    stringBuilder.append(Character.toChars(temp));
                }
                return stringBuilder.toString();
            } catch (IOException e) { //Ловим исключение
                throw new RuntimeException(e);
            }
        } else {
            return way;
        }
    }
    //Данный метод удаляет символы кроме символов русского алфавита, цифр и "-"
    public static String deleteSomeSymb(String way) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayL = way.split(" ");
        for (int i = 0; i < arrayL.length; i++) {
            if (arrayL[i].contains("-")) {
                char[] temp = arrayL[i].toCharArray();
                StringBuilder sBld = new StringBuilder();
                for (char t : temp) {
                    if (t != 45 || sBld.length() != 0) {
                        sBld.append(t);
                    }
                }
                arrayL[i] = sBld.toString();
            }
        }

        for (String element : arrayL) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            char[] temp = element.toCharArray();
            for (char t : temp) {
                if (t == 45 || (t >= 1040 && t <= 1103) || (t >= 48 && t <= 57)) {
                    stringBuilder.append(Character.toChars(t));
                } else {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }
    //Данный метод создает массив типа File
    public static File[] listChildFile(String way) {
        File finalDir = new File(way);
        return finalDir.listFiles();
    }
    //Данный метод ищет и записывает в файлик
    public static void searchAndWrite(File result, String file, String word, String nameFile) {
        EasySearch easySearch = new EasySearch();
        try {
            try (FileWriter fileWriter = new FileWriter(result, true)) {
                long count = easySearch.search(RefactorToString.convert(nameFile), word);
                fileWriter.write(file + " - " + word + " - " + count + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
