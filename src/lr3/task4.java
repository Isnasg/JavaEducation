package lr3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int s = in.nextInt();
        System.out.println("Введите второе число: ");
        int u = in.nextInt();
        int c;
        if (s < u) {
            System.out.println("Наименьшее число: " + s);
            u--;
            while (s < u) {
                s++;
                c = s;
                System.out.println(c + " ");
            }
            u++;
            System.out.println("Наибольшее число:  " + u);
        } else {
            System.out.println("Наименьшее число: " + u);
            for (c = u;  c < s; c++)
                System.out.println(c + " ");
            System.out.println("Наибольшее число: " + s);
        }

    }
}

// 4. Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).