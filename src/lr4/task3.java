package lr4;

public class task3 {
    public static void main(String[] args) {
        int [][] Array = new int [7][10];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = 2;
                System.out.print(Array [i][j]);
            }
            System.out.println(" ");
        }
    }
}
