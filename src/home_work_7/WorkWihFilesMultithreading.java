package home_work_7;

import home_work_7.realization_of_interface.EasySearch;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkWihFilesMultithreading {
    //Данный метод ищет слово, который указал пользователь
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter directory");
        String next = scanner.nextLine();

        File[] list = RefactorToString.listChildFile(next);
        File result = new File("result.txt");
        if (result.exists()) {
            boolean resultDelete = result.delete();
            if (!resultDelete) {
                System.out.println("Something was wrong");
                return;
            }
        }
        while (true) {
            System.out.println("Please, for search enter the word");
            System.out.println("For stop program enter: stop");
            String typo = scanner.nextLine();

            if (typo.equalsIgnoreCase("stop")) {
                executorService.shutdown();
                break;
            } else {
                for (File f : list) {
                    executorService.submit(new WordSearchFile(new EasySearch(), result, f, typo));
                }
            }
        }
    }
}
