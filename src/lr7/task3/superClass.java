package lr7.task3;

public class superClass {
    public int cat;

    superClass(int a) {
        this.cat = a;
    }

    superClass() {

    }

    @Override
    public String toString() {
        String get =  this.getClass().getSimpleName() + " int = " + this.cat;
        return get;
    }
}
