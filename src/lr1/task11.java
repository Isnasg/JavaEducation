package lr1;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s;
        s = 2022;
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите год вашего рождения: ");
        int age = in.nextInt();

        s -= age;

        System.out.println("Пользователь " + name + ", возрастом " + s + " лет(год, года)");
        in.close();

    }

}
