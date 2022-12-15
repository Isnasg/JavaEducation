package lr4;
import java.util.Random;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int i;
        int j;
        System.out.print("Введите количество строк: ");
        int a = id.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = id.nextInt();
        int [][] Array = new int [a][b];
        int [][] Array2 = new int [b][a];
        Random random = new Random();
        System.out.println("Исходный массив ");
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length; j++) {
                Array[i][j] = random.nextInt(10);
                System.out.print(Array [i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Массив после смены местами строк и столбцов ");
        for (i = 0; i < Array2.length; i++) {
            for (j = 0; j < Array2[i].length; j++) {
                Array2[i][j] = Array[j][i];
                System.out.print(Array2 [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
