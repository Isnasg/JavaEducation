package lr3;
public class task8 {
    public static void main(String[] args) {
        char j = 'A';
        char[] nums = new char[10]; // Создание массива с размером введённым из консоли
        for (int i = 0 ; i < nums.length ; ){
        if (j != 'A' && j != 'E' && j != 'I' && j != 'O' && j != 'U') {
            nums[i] = j;
            System.out.println("Элемент массива [" + i + "] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
            i++;
        }
        j++;
    }
    }
}
//8. Напишите программу, в которой создается символьный массив из
//        10 элементов. Массив заполнить большими (прописными) буквами
//        английского алфавита. Буквы берутся подряд, но только согласные (то есть
//        гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//        нужно пропустить). Отобразите содержимое созданного массива в консольном
//        окне
