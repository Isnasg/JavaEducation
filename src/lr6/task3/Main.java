package lr6.task3;
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
            Task3.Metod(nums);
        }
    }
}

//3. Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел.
