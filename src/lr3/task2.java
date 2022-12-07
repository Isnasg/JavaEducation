package lr3;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String s = in.nextLine();
        switch (s) {
            case "Понедельник":
                System.out.println("Это первый день недели");
                break;
            case "Вторник":
                System.out.println("Это второйй день недели");
                break;
            case "Среда":
                System.out.println("Это третий день недели");
                break;
            case "Четверг":
                System.out.println("Это четвертый день недели");
                break;
            case "Пятница":
                System.out.println("Это пятый день недели");
                break;
            case "Суббота":
                System.out.println("Это шестой день недели");
                break;
            case "Воскресенье":
                System.out.println("Это седьмой день недели");
                break;
            default:
                System.out.println("Введён не день недели");
        }
        in.close();
    }
}

//      2. Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch