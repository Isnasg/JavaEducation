package lr3;
import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Random; // пакет для подключения класса Random и создания объекта для генерации случайного числа
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения
public class task9 {
    public static void main(String[] args) {
        int copy;
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива ["+i+"] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
        Arrays.sort(nums); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
        for (int i = 0 ; i + 1 < nums.length ; i++ ){
            copy = nums [i];
            i++;
            if (copy == nums [i]) {
                i--;
                System.out.print("Элемент массива [" + i + "] и ");
                i++;
                System.out.println("[" + i + "] равны " + nums[i]);
            }
            i--;
        }
    }
}

