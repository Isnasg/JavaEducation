package lr1;
import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s3, s4;
        System.out.println("Введ ите первое число ");
        int s1 = in.nextInt();
        System.out.println("Введите второе число ");
        int s2 = in.nextInt();

        s3 = s1 + s2;
        s4 = s1 - s2;

        System.out.println("Сумма чисел: "  + s3 );
        System.out.println("Разница чисел: "  + Math.abs(s4));
        in.close();

    }

}
