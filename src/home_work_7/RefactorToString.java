package home_work_7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RefactorToString {
    //Данный метод конвертит файл в строку, понадобится для мейна
    public static String convertToString(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(text);
        if (file.exists() && !file.isDirectory()) {
            try (FileReader fileReader = new FileReader(text)) {
                int temp;
                while ((temp = fileReader.read()) != -1) {
                    stringBuilder.append(Character.toChars(temp));
                }
                return stringBuilder.toString();
            } catch (IOException e) { //Ловим исключение
                throw new RuntimeException(e);
            }
        } else {
            return text;
        }
    }
    //Данный метод удаляет символы кроме символов русского алфавита, цифр и "-"
    public static String deleteSomeSymb(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayL = text.split(" ");
        for (int i = 0; i < arrayL.length; i++) {
            if (arrayL[i].contains("-")) {
                char[] temp = arrayL[i].toCharArray();
                StringBuilder cor = new StringBuilder();
                for (char t : temp) {
                    if (t != 45 || cor.length() != 0) {
                        cor.append(t);
                    }
                }
                arrayL[i] = cor.toString();
            }
        }

        for (String elem : arrayL) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            char[] temp = elem.toCharArray();
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
}
