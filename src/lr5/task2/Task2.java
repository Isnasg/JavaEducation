package lr5.task2;

public class Task2 {

    public char nach = 'A';
    public char kon = 'Z';

    public char Alfavit() {
        for(;nach <= kon; nach++) {
            System.out.println(nach);
        }
        return nach;
    }

}
