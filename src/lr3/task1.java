package lr3;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сегодняшнее число: ");
        int s = in.nextInt();
       switch (s) {
           case 1:
               System.out.println("Сегодня Понедельник");
               break;
           case 2:
               System.out.println("Сегодня Вторник");
               break;
           case 3:
               System.out.println("Сегодня Среда");
               break;
           case 4:
               System.out.println("Сегодня Четверг");
               break;
           case 5:
               System.out.println("Сегодня Пятница");
               break;
           case 6:
               System.out.println("Сегодня Суббота");
               break;
           case 7:
               System.out.println("Сегодня Воскресенье");
               break;
           default:
                System.out.println("Введено число не от 1 до 7");
       }
        in.close();
    }
}

// 1.    Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.

