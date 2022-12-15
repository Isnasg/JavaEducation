package lr4;

public class task4 {
    public static void main(String[] args) {
        String[][] Array = new String[10][10];
        int i, j;
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length; j++) {
                if (i == 0) {
                    switch (j) {
                        case (0):
                            Array[i][j] = "┌";
                            break;
                        case (9):
                            Array[i][j] = "┐";
                            break;
                        default:
                            Array[i][j] = "-";
                            break;
                    }
                }
                if (i == Array.length - 1) {
                    switch (j) {
                        case (0):
                            Array[i][j] = "└";
                            break;
                        case (9):
                            Array[i][j] = "┘";
                            break;
                        default:
                            Array[i][j] = "-";
                            break;
                    }
                }
                if (i != Array.length - 1 && i != 0) {
                    if (j == 0 || j == 9) {
                        Array[i][j] = "|";
                    } else {
                        Array[i][j] = " ";
                    }
                }
            }
        }
        for (i = 0; i < Array.length; i++) {
            for (j = 0; j < Array[i].length; j++) {
                System.out.print(Array [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}


