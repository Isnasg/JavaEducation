package lr3;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        int a = 0;
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        if (size > 0) {
            int[] nums = new int[size]; // Создание массива с размером введённым из консоли
            for (int i = 0 ; i < nums.length ; i++ ){
                c = a;
                while (c % 5 != 2) {
                    a++;
                    c = a;
                }
                nums[i] = a;
                a++;
                System.out.println("Элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
            }
        } else {
            System.out.println("Некорректный размер массива");
        }
    }
}
// 6. Напишите программу, в которой создается одномерный числовой
//        массив и заполняется числами, которые при делении на 5 дают в остатке 2
//        (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//        Предусмотреть обработку ошибки, связанной с вводом некорректного
//        значения.
