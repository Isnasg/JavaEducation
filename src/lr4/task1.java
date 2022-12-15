package lr4;

public class task1 {
    public static void main(String[] args) {
        //Пример программы, которая выводит на консоль Прямоугольник со сторонами, ширина: 15 символов, высота: 10 строк.
        int figure = 11; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (i = 1; i <= figure; i++) {
            z = 0;
            for (j = -12; j < figure; j++) {
                z = z + 1;
                if (i == 1) {
                    switch (j){
                        case(-12):
                            System.out.print("┌");
                            break;
                        case(10):
                            System.out.print("┐");
                            break;
                        default:
                            System.out.print("-");
                            break;
                    }
                }
                if (i == figure) {
                    switch (j){
                        case(-12):
                            System.out.print("└");
                            break;
                        case(10):
                            System.out.print("┘");
                            break;
                        default:
                            System.out.print("-");
                            break;
                    }
                }
                if (i != figure && i != 1) {
                    if (j == -12 || j == 10) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("  номер строки: " + i + " ");
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
