package lr7.task2;

public class subClass extends superClass {

    int num;

    public void metodTwo() {
        super.metod();
    }

    public void metodTwo(String a) {
        super.metod(a);
    }

    public void metodTwo(int a) {
        this.num = a;

    }

    public void metodTwo(String a, int b) {
        this.num = b;
        super.metod(a);

    }

    subClass(String a, int b) {
        super(a);
        this.num = b;
    }

    public String toString() {
        String getName =  "Name = " + this.getClass().getSimpleName() + "; string= " + super.getStr1() + "; lenght = "
                + super.rez() + "; int = " + this.num;
        return getName;
    }

}
