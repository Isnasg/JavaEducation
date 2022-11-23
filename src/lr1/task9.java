package lr1;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой месяц? ");
        String month = in.nextLine();

        System.out.println("Сколько в этом месяце дней? ");
        int days = in.nextInt();

        System.out.println("В месяце " + month + " " + days + " дней(дня, день)");
        in.close();

    }

}
