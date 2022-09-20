package home_work_2.loops.overflow;

public class OverflowProblemWithNumbers {
    public static void main(String[] args) {
        long num = 1;
        System.out.println("Result after overflow : " + factorial(num));
    }

    public static long factorial(long number) {
        long result = number;
        long beforeOverflow = 0;
        for (int i = 3; ; ) { //Сюда также можно подставить и 188. -19 будет работать некорректно!
            result = result * i;
            if (result < 0) {
                System.out.println("Result before overflow : " + beforeOverflow);
                break;
            }
            beforeOverflow = result;
        }
        return result;
    }
}
