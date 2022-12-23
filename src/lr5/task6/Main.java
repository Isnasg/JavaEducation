package lr5.task6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Random random = new Random();
        System.out.println("В данный момент переменные равны нулю");
        boolean kon = false;
        while (!kon) {
            System.out.println("Сколько рандомных чисел сравнить? 1/2");
            int vibor = id.nextInt();
            switch (vibor) {
                case (2): {
                    int x = random.nextInt(100);
                    int y = random.nextInt(100);
                    System.out.println("Числа: " + x + " и " + y);
                    Task6 task = new Task6(x, y);
                    kon = true;
                    break;
                }
                case (1): {
                    int x = random.nextInt(100);
                    System.out.println("Числj: " + x);
                    Task6 task = new Task6(x);
                    kon = true;
                    break;
                }
                default: {
                    System.out.println("Некорректное значение ");
                }
            }
        }

    }
}
//6. Напишите программу с классом, в котором есть два закрытых
//        целочисленных поля (назовем их max и min). Значение поля max не может
//        быть меньше значения поля min. Значения полям присваиваются с помощью
//        открытого метода. Метод может вызываться с одним или двумя
//        целочисленными аргументами. При вызове метода значения полям
//        присваиваются так: сравниваются текущие значения полей и значения
//        аргументов, переданных методу. Самое большое из значений присваивается
//        полю max, а самое маленькое из значений присваивается полю min.
//        Предусмотрите конструктор, который работает по тому же принципу, что и
//        метод для присваивания значений полям. В классе также должен быть метод,
//        отображающий в консольном окне значения полей объекта.
