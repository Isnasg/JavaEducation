package lr1;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сегодня день недели? ");
        String week = in.nextLine();

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Какое сегодня число? ");
        int day = in.nextInt();

        System.out.println("Сегодня " + week + ", " + day + " число, месяц" + month);
        in.close();

    }
}
