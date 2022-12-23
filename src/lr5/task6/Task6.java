package lr5.task6;

public class Task6 {

    private int min;
    private int max;
    public Task6(int x){
        max = x;
        System.out.println("Так как число одно, то оно максимальное, а значит ");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    public Task6(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else {
            if (x < y) {
                max = y;
                min = x;
            } else {
                System.out.println("Числа равны " + x);
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
