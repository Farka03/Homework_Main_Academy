package home_work_7;

import java.io.File;
import java.util.Scanner;

public class WorkWithFiles {
    //Данный метод ищет слово в директории
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter directory");
        String next = scanner.nextLine();

        File[] list = RefactorToString.listChildFile(next);
        showListFile(list);
        File result = new File("result.txt");
        if (result.exists()) {
            boolean resultDelete = result.delete();
            if (!resultDelete) {
                System.out.println("Something was wrong");
                return;
            }
        }
        String file = chooseFile();
        String fileName = next + file;
        while (true) {
            System.out.println("Back to files enter: back");
            System.out.println("Stop the program: stop");
            System.out.println("Search word: search");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("back")) {
                showListFile(list);
                file = chooseFile();
                fileName = next + file;
            } else if (word.equalsIgnoreCase("stop")) {
                break;
            } else {
                RefactorToString.searchAndWrite(result, file, word, fileName);
            }
        }
    }
    //Данный метод выводит в консоль имена файлов в директории
    private static void showListFile(File[] list) {
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
    //Данный метод получается у юзера наименования файла
    private static String chooseFile() {
        System.out.println("Enter the name of file from list");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
