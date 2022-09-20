package home_work_1;
public class ClassMath {
    public static void main(String[] args){
        int minusOne = -1;
        int two = 2;
        int four = 4;
        int eight = 8;

        float onePointFive = 1.5f;

        int radians = 90;

        System.out.println(Math.abs(minusOne)); //Вычисляет значение по модулю. Ответ будет 1
        System.out.println(Math.pow(four,two)); //Возводит в квадратную степень число. Ответ будет 16.0

        System.out.println(Math.round(onePointFive)); //Если дробная часть числа равно или больше 0,5, то округляет в большую сторону. Ответ будет 2
        System.out.println(Math.floor(onePointFive)); //Округляет всегда в меньшую сторону. Ответ будет 1.0
        System.out.println(Math.ceil(onePointFive)); //Округляет всегда в большую сторону. Ответ будет 2.0

        System.out.println(Math.sqrt(four)); //Выводит квадратный корень из числа. Ответ 2.0
        System.out.println(Math.cbrt(eight)); //Выводит кубический корень из числа. Ответ 2.0

        System.out.println(Math.sin(Math.toRadians(radians))); //Перевод угол из градусов в радианы. Ответ 1.0
        System.out.println(Math.cos(Math.toRadians(radians))); //Перевод угла из градусов в радианы. Ответ 6.123233995736766E-17

        for (int i = 0; i < 3; i++) {
            System.out.println(Math.random()); //Выводится 3 рандомных числа.
        }
    }
}
