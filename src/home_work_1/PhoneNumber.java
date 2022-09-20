package home_work_1;

public class PhoneNumber {
    public static void main(String[] args){
        System.out.println(createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0})); //Выводим ответ в консоль
    }

    public static String createPhoneNumber(int[] phoneNumberArr) {
        String resultWithMask = "(###) ###-####"; //Вводим наш образец, как должен будет выглядеть ответ
        for (int i = 0; i < phoneNumberArr.length; i++) { //Создаем цикл, который проходится по всем числам массива
            resultWithMask = resultWithMask.replaceFirst("#", phoneNumberArr[i] + ""); //Вместо решеток вставляем числа из массива
        }
        return resultWithMask; //Возвращаем результат
    }
}


