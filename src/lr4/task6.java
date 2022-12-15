package lr4;
import java.util.Random;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = id.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = id.nextInt();
        int d, c;
        int[][] Array = new int[a][b];
        int[][] Array2 = new int[a-1][b-1];
        Random random = new Random();
        System.out.println("Исходный массив ");
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = random.nextInt(10);
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
        d = random.nextInt((a - 2) + 1) + 1;
        d++;
        System.out.print("Номер удаленной строки - " + d);
        d--;
        c = random.nextInt((b - 2) + 1) + 1;
        c++;
        System.out.println(", столбца - " + c);
        c--;
        int i = 0, j = 0;
        for (int i2 = 0; i2 < Array2.length; i2++) {
            for (int j2 = 0; j2 < Array2[i2].length; j2++) {
                if (i == d) {
                    i++;
                }
                if (j == c) {
                    if (j < Array[i].length) {
                        j++;
                    }
                }
                Array2[i2][j2] = Array[i][j];
                System.out.print(Array2[i2][j2] + " ");
                j++;
            }
            i++;
            j = 0;
            System.out.println(" ");
        }
    }
}
