package lr2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Введите целое число, попадющее в диапазон от 5 до 10 включительно");
        int s = in.nextInt();
        if (s > 10) {
            System.out.println("Число больше 10");
            i++;
        }
        if (s < 5) {
            System.out.println("Число меньше 5");
            i++;
        }
        if (i == 0) {
            System.out.println("Число находится в диапазоне от 5 до 10 включительно ");
        }
        in.close();
    }
}

