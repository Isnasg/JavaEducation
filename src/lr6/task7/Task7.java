package lr6.task7;

public class Task7 {
    static void Metod(char[] array) {
        int [] array2 = new int[array.length];
        System.out.print("\nНовый массив ");
        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];
            System.out.print(array2[i] + " ");
        }
    }
}
