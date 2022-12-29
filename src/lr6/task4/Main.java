package lr6.task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число, двойной факториал которого необходимо найти");
        int factor = id.nextInt();
        Task4.FactorialWithRecursia(factor);
        Task4.FactorialWithoutRecursia(factor);
    }
}
//4. Напишите программу, в которой описан статический метод для вычисления
//        двойного факториала числа, переданного аргументом методу. По определению, двойной
//        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
//        Предложите версию метода без рекурсии и с рекурсией.
