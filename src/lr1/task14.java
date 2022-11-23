package lr1;
import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s2, s3, s4, s5;
        s5 = 2;
        System.out.println("Введите число ");
        int s1 = in.nextInt();

        s2 = s1 - 1;
        s3 = s1 + 1;
        s4 = s2 + s3;

        System.out.println("Ваше число: "  + s1 );
        System.out.println("На единицу меньше: "  + s2 );
        System.out.println("На единицу больше: "  + s3 );
        System.out.println("Квадрат суммы чисел больше и меньше " + Math.pow(s4, s5) );
        in.close();

    }

}
