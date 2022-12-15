package lr4;
import java.util.Arrays;
import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = id.nextLine();
        System.out.println("Введите ключ для шифрования");
        int key = id.nextInt();
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        for(int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char) ints[i];
        }
        System.out.println(Arrays.toString(chars));
        boolean kon = false;
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (!kon) {
            String ans = id.next();
            switch (ans) {
                case ("y"):
                    for (int i = 0; i < chars.length; i++) {
                        ints[i] = chars[i] - key;
                        chars[i] = (char) ints[i];
                        kon = true;
                    }
                    String string = new String(chars);
                    System.out.println(string);
                    break;
                case ("n"):
                    System.out.println("До свидания!");
                    kon = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
            }
        }
    }
}
