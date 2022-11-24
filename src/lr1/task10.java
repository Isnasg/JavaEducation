package lr1;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s;
        s = 2022;
        System.out.println("Вве дите год вашего рождения: ");
        int age = in.nextInt();

        s -= age;

        System.out.println("Вам " + s + " лет(год, года)");
        in.close();

    }
}
