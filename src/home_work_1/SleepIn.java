package home_work_1;

public class SleepIn {
    public static void main(String[] args) {
        boolean canSleep = sleepIn(true, false); //Создаем объект и передаем в параметры любые булевы значение
        if (canSleep) { //Если переменная true, то выполняется этот блок кода
            System.out.println("Спи дальше");
        } else { //Если переменная не true, то выполняется этот блок кода
            System.out.println("На работу пора");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
