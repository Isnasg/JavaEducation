package lr6.task10;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int kolichestvo = id.nextInt();
        if (kolichestvo <= 0) {
            System.out.print("Нет аргументов ");
        } else {
            System.out.print("Рандомные числа: ");
            int[] nums = new int[kolichestvo];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(100);
                System.out.print(nums[i] + " ");
            }
            Task10.Metod(nums);
        }
    }
}

//10. Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу.
