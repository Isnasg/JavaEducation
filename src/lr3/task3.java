package lr3;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибаначи: ");
        int s = in.nextInt();
        if (s < 40) {
            int b, c;
            b = c = 1;
            int i = 0;
            byte j = 0;
            while (i < s) {
                if (j == 0) {
                    System.out.print(b + " ");
                    b += c;
                    j = 1;
                    i++;
                } else {
                    System.out.print(c + " ");
                    c += b;
                    j = 0;
                    i++;
                }
            }
        } else {
            System.out.println("Слишком большое число для вывода ");
        }

    }
}
//  3. Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.