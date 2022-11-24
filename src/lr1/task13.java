package lr1;
import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s3;
        System.out.println("Введи те первое число ");
        int s1 = in.nextInt();

        System.out.println("Введите второе число ");
        int s2 = in.nextInt();

        s3 = s1 + s2;

        System.out.println("Сумма чисел " + s1 + " и " + s2 + " - " + s3);

    }

}
