package lr5.task4;

public class Task4 {

    public char ch1;
    public int in1;

    public Task4 () {

    }
    public Task4 (double h) {
        char ch1 = (char) h;
        int in2 = (int) h;
        int in1 = (int) ((h-(int)h)*100);
        System.out.println("В char число равно " + ch1);
        System.out.println("В int число равно " + in1);
    }

}
