package lr2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int const1 = 4;
        int res1;
        int i = 0;
        System.out.println("Введите число, удовлетворяющее требованиям: \n 1) число целиком делится на 4 \n 2) число не меньше 10");
        int s = in.nextInt();
        res1 = s % const1;
        if (s < 10) {
            System.out.println("Число меньше 10");
            i++;
        }
        if (res1 != 0) {
            System.out.println("Число не делится целиком на 4, остаток " + res1);
            i++;
        }
        if (i == 0) {
            System.out.println("Число удовлетворяет оба требования ");
        }
            in.close();
    }
}
