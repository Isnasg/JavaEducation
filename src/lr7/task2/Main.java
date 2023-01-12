package lr7.task2;
import lr7.task1.subClassTest;
import lr7.task1.superClassTest;

public class Main {
    public static void main(String[] args) {

        superClass one = new superClass("ABCD");
        System.out.println("\n" + one.toString());
        one.metod("AB");
        System.out.println(one.toString()+ "\n");


        subClass two = new subClass("ABC", 1);
        two.metodTwo();
        System.out.println(two.toString());
        two.metodTwo("DEF");
        System.out.println(two.toString());
        two.metodTwo(2);
        System.out.println(two.toString());
        two.metodTwo("ZXCursed", 3);
        System.out.println(two.toString());
    }
}
//2. Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//        базовом классе должен быть метод для присваивания значения полю: без параметров и с
//        одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//        аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//        длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//        дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//        для присваивания значений полям (используется переопределение и перегрузка метода из
//        суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//        текстовым и целочисленным параметром. У конструктора подкласса два параметра
//        (целочисленный и текстовый).