package lr6.task5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число");
        int kvadr = id.nextInt();
        System.out.print("Сумма квадратов натуральных чисел до " + kvadr + " = ");
        Task5.KvadratWithRecursia(kvadr);
        Task5.KvadratWithoutRecursia(kvadr);
    }
}

//5. Напишите программу со статическим методом, которым вычисляется сумма
//        квадратов натуральных чисел 1(2) + 2(2) + 3(2) + ... + п(2). Число п передается аргументом методу.
//        Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
//        использовать формулу 1(2)+2(2)+3(2)+…+n(2)= (n+l) (2n + 1)/6
