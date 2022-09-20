package home_work_7;

import home_work_7.realization_of_interface.EasySearch;
import home_work_7.realization_of_interface.SearchDecorator;

public class Main {
    public static void main(String[] args){
    //Вывод результатов
    EasySearch easySearch = new EasySearch();
    SearchDecorator searchDecorator = new SearchDecorator(easySearch);
    String x = RefactorToString.convertToString("src/home_work_7/ВойнаИМир.txt");

    System.out.println("How many times война with register : ");
    System.out.println(easySearch.search(x, "война"));

    System.out.println("How many times война without register : ");
    System.out.println(searchDecorator.search(x, "война"));

    System.out.println("How many times мир with register : ");
    System.out.println(easySearch.search(x, "мир"));

    System.out.println("How many times мир without register : ");
    System.out.println(searchDecorator.search(x, "мир"));

    System.out.println("How many times и with register : ");
    System.out.println(easySearch.search(x, "и"));

    System.out.println("How many times и without register : ");
    System.out.println(searchDecorator.search(x, "и"));
    }
}

