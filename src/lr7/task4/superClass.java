package lr7.task4;

class superClass {
    public char bear;

    superClass(char a) {
        this.bear = a;
    }

    superClass() {
    }

    public superClass(superClass copy) {
        this.bear = copy.bear;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bear;
        return get;
    }
}
