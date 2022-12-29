package lr6.task4;

public class Task4 {

    static int score = 1;

    static void FactorialWithoutRecursia(int factor) {
        score = 1;
        while (factor > 0) {
            score *= factor;
            factor -= 2;
        }
        System.out.println("Двойной факториал равен = " + score);
    }
    static void FactorialWithRecursia(int factor) {
        if (factor != 1 & factor > 0) {
            score *= factor;
            factor -= 2;
            FactorialWithRecursia(factor);
        } else {
            System.out.println("Двойной факториал равен = " + score);
        }
    }
}
