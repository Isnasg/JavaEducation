package lr6.task6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int kolichestvo = id.nextInt();
        System.out.print("Введите число: ");
        int a = id.nextInt();
        if (kolichestvo <= 0) {
            System.out.print("Нет аргументов ");
        } else {
            System.out.print("Исходный массив ");
            int[] nums = new int[kolichestvo];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(100);
                System.out.print(nums[i] + " ");
            }
            Task6.Metod(nums, a);
        }
    }
}

//6. Напишите программу со статическим методом, которому аргументом передается
//        целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//        массив, который получается из исходного массива (переданного первым аргументом
//        методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//        нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//        аргумент метода больше длины массива, переданного первым аргументом, то методом
//        создается копия исходного массива и возвращается ссылка на эту копию.