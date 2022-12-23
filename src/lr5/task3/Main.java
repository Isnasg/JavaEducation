package lr5.task3;

public class Main {
    public static void main(String[] args) {

        Task3 vitya = new Task3();
        Task3 petya = new Task3(160);
        Task3 vlad = new Task3(180, 80);
        System.out.println("Витя не сказал свой рост и вес, поэтому запишем " + vitya.rost);
        System.out.println("Петя сказал только свой рост, " + petya.rost);
        System.out.println("Влад сказал свой рост " + vlad.rost + ", а вес " + vlad.ves);
    }
}

//3. Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей одного аргумента и с передачей
//        двух аргументов.
