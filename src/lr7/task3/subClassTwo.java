package lr7.task3;

public class subClassTwo extends subClass {
    public String name;


    subClassTwo(int a, char b, String c) {
        this.cat = a;
        this.chiken = b;
        this.name = c;
    }

    @Override
    public String toString() {
        String get = this.getClass().getSimpleName() + " int = " + this.cat + " char = " + this.chiken
                + " String = " + this.name;
        return get;
    }
}
