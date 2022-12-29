package lr6.task9;

public class Task9 {
    static void Razvorot(char[] array) {
        int kon = array.length - 1;
        char tmp;
        System.out.print("\nИзменённый массив: ");
        for(int i = 0; i < (array.length); i++) {
            if (i < kon) {
                tmp = array[i];
                array[i] = array[kon];
                array[kon] = tmp;
            } else if (kon >= i) {
                break;
            }
            kon--;
        }
        for(int i = 0; i < (array.length); i++) {
            System.out.print(array[i] + " ");
        }
    }
}
