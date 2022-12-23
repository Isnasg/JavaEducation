package lr5.task1;
//import classes.lr5.task1.Task1;
public class Main {

    public static void main(String[] args) {

        Task1 task1 = new Task1();

        task1.setCh1('K');
        System.out.println(task1.getCodeSimbol());
        task1.showCodeAndValue();

    }

}



//1. Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.
