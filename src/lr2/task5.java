package lr2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        System.out.println("Введите число: ");
        int s = in.nextInt();
        res = s / 1000;
        if (res >= 10) {
            res = res % 10;
        }
        System.out.println("В числе  " + res + " тысяч(-и, -а)" );
    }
}
