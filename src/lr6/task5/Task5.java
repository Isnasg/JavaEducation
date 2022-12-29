package lr6.task5;

public class Task5 {

    static int score = 0;
    static void KvadratWithoutRecursia(int kvadr) {
        int score = 0;
        for (int i = 1; i <= kvadr; i++) {
            score += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов натуральных чисел до " + kvadr + " = " + score);
    }

    static void KvadratWithRecursia(int kvadr) {
        if (kvadr > 0) {
            score += Math.pow(kvadr, 2);
            kvadr--;
            KvadratWithRecursia(kvadr);
        } else if (kvadr == 0) {
            System.out.println(+ score);
        }
    }
}
