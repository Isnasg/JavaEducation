package lr4;

public class task2 {
    public static void main(String[] args) {
        int figure = 10; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        int a = 1;
        for (i = 1; i <= figure; i++) {
            z = 0;
            for (j = 1; j <= a; j++) {
                z = z + 1;
                if (i == 1 && j == 1) {
                    System.out.print("^ ");
                }
                if (i == figure) {
                    switch (j) {
                        case (1):
                            System.out.print("└ ");
                            break;
                        case (10):
                            System.out.print("⦣");
                            break;
                        default:
                            System.out.print("- ");
                            break;
                    }
                }
                if (i != figure && i != 1) {
                    if (j == 1) {
                        System.out.print("|");
                    } else {
                        System.out.print("  ");
                    }
                }
                if (j == a  && j != 1 && j != figure) {
                    System.out.print("\\");
                }
            }
            if (a <= figure) {
                a++;
            }
            System.out.print("  номер строки: " + i + " ");
            System.out.println(" Количество символов в строке " + z);
        }
        System.out.println(" Стороны треугольника равны " + figure);
    }
}