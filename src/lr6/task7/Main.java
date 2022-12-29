package lr6.task7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        int rand;
        System.out.print("Введите количество элементов массива: ");
        int kolichestvo = id.nextInt();
        if (kolichestvo <= 0) {
            System.out.print("Нет аргументов ");
        } else {
            System.out.print("Исходный массив ");
            char[] array = new char[kolichestvo];
            for (int i = 0; i < array.length; i++) {
                rand = random.nextInt(26);
                array[i] = (char) (rand + 'A');
                System.out.print(array[i] + " ");
            }
            Task7.Metod(array);
        }
    }
}

//7. Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.
