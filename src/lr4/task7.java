package lr4;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = id.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = id.nextInt();
        int ost = 0;
        int score = 0;
        int i;
        int j;
        int[][] Array = new int[a][b];
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length - ost; j++) {
                Array[i][j] = score;
                score++;
            }
            j--;
            for (int h = a - 1; h > ost; h--) {
                Array[h][j] = score;
                score++;
            }
            ost++;
        }
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length; j++) {
                System.out.print(Array [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
