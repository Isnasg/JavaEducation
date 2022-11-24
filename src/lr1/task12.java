package lr1;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s;
        s = 2022;
        System.out.println("Введи те ваш возраст: ");
        int age = in.nextInt();

        s -= age;

        System.out.println("Вы родились в " + s + " году");
        in.close();

    }

}
