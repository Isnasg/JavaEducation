package lr2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int const1 = 5;
        int const2 = 7;
        int res1, res2;
        int i = 0;
        System.out.println("Введите число, удовлетворяющее требованиям: \n 1) при делении на 5 в остатке получается 2 \n 2) при делении на 7 в остатке получается 1");
        int s = in.nextInt();
        res1 = s % const1;
        res2 = s % const2;
        if (s < 5) {
            System.out.println("Число слишком маленькое и не делится ни на один из операндов");
        }
        else {
            if (s < 7) {
                System.out.println("Число маленькое и не делится 7");
            }
            else {
                if (res1 == 2) {
                    i++;
                }
                if (res2 == 1) {
                    i++;
                }
                if (i == 0) {
                    System.out.println("Число не удовлетворяет оба требования, остаток после деления на 5 = " + res1 + ", а остаток после деления на 7 = " + res2);
                }
                else {
                    if (i == 1) {
                        System.out.println("Число удовлетворяет лишь одно требование, остаток после деления на 5 = " + res1 + ", а остаток после деления на 7 = " + res2);
                    } else {
                        System.out.println("Число удовлетворяет оба требования, остаток после деления на 5 = 2, а остаток после деления на 7 = 1");
                    }
                }
            }
            in.close();
        }
    }
}
