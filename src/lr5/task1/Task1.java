package lr5.task1;

public class Task1 {

    private char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCodeSimbol(){
        return ch1;
    }

    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
