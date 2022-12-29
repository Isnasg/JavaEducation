package lr6.task9;

public class Main {
    public static void main(String[] args) {
        char[] array = new char[26];
        char alf = 'A';
        System.out.print("Исходный массив: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = alf;
            alf++;
            System.out.print(array[i] + " ");
        }
        Task9.Razvorot(array);
    }
}

//9. Напишите программу со статическим методом, аргументом которому передается
//        одномерный символьный массив. В результате вызова метода элементы массива попарно
//        меняются местами: первый — с последн и м , второй — с предпоследним и так далее.
