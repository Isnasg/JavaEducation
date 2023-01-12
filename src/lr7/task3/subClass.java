package lr7.task3;

public class subClass extends superClass{
    public char chiken;

    subClass(int a, char b) {
        this.cat = a;
        this.chiken = b;
    }

    subClass() {
    }

    @Override
    public String toString() {
        String get =  this.getClass().getSimpleName() + " int = " + this.cat + " char = " + this.chiken;
        return get;
    }
}
