package home_work_1;

public class Priority {

    static int two = 2; //Объявляем статичные переменные

    static int eight = 8;

    public static void main(String[] args){
        int firstResult = 5 + two / eight;
        System.out.println("First example solution : " + firstResult); //Ответ 5, потому что 5 + одна четвертая = 5,25. В ответ берется целое число, то есть 5.

        int secondResult = (5 + two) / eight;
        System.out.println("Second example solution : " + secondResult);//Ответ 0, потому что 7 разделить на 8 будет равно 0.875 и берем в ответ целое число, то есть ноль.

        int thirdResult = (5 + two++) / eight; //Ответ 0, потому что 7 / 8 = 0,875, в ответ берем 0.
        System.out.println("Third example solution : " + thirdResult);

        int fourthResult = (5 + two++) / --eight; //Ответ 1, потому что 5 + 2 = 7 и делим на прединкремент восьми, получаем 7 разделить на 7 = 1
        System.out.println("Fourth example solution : " + fourthResult);

        int fifthResult = (5 * two >> two++) / --eight; //Ответ 0, потому что 10 в двоичной системе - 1010. 1010 сдвигаем на 2 бита, получается 10 в двоичной системе. В ответе - 2/7, но так как у нас int, ответ 0.
        System.out.println("Fifth example solution : " + fifthResult);

        int sixthResult = (5 + 7 > 20 ? 68 : 22 * 2 >> two++) / --eight; //Ответ 0. Будет 2/-7
        System.out.println("Sixth example solution : " + sixthResult);

        //int seventhResult = (five + seven > twenty ? sixtyEight >= sixtyEight : twentyTwo * two >> two++) / --eight;
        //System.out.println("Seventh example solution : " + seventhResult); //Левое выражение отсутствует и поэтому не компилится

        boolean eighthResult = 6 - two > 3 && 12 * 12 <= 119; //Ответом будет false, потому что хоть и 4 больше 3, но 144 не меньше либо равно 119.
        System.out.println("Eighth example solution : " + eighthResult);

        boolean ninthResult = true && false; //При операторе && между true или false выбирается false
        System.out.println("Ninth example solution : " + ninthResult);
    }
}
