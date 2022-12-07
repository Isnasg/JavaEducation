package lr3;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел для суммы: ");
        int s = in.nextInt();
        int i = 0;
        int sum = 0;
        int a;
        int c = 0;
        do {
        c++;
        a = c;
        a %= 3;
            switch (a) {
                case (1):
                    a = c;
                    if (a % 5 == 2) {
                        i++;
                        System.out.println("Число № " + i + " = " + c);
                        sum += c;
                    }
            }

        }
        while (i < s);
        System.out.println("Сумма всех чисел " + sum);
    }
}

//  5. Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.
