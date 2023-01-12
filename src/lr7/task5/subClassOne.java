package lr7.task5;

class subClassOne extends superClass {
    protected int wolf;

    subClassOne(String a, int b) {
        this.wolf = b;
        this.sheep = a;
    }

    @Override
    public String toString() {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.sheep
                + " Int = " + this.wolf;
        return getName;
    }
}
