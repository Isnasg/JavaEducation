package lr2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res, res2;
        double res1;
        System.out.println("Введите число: ");
        int s = in.nextInt();
        res2 = s / 3;
        res = s % 3;
        res1 = res * 0.33 + res2;
        System.out.println("Ответ -  " + res1);
        if (res == 0) {
            System.out.println("Введенное число делится на три без остатка ");
        } else {
            System.out.println("Введенное число не делится на три без остатка ");
        }
        in.close();
    }
}