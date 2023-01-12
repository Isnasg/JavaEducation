package lr7.task5;

class subClassTwo extends superClass {

    protected char farmer;

    subClassTwo(String a, char c) {
        this.farmer = c;
        this.sheep = a;
    }

    @Override
    public String toString() {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.sheep
                + " Char = " + this.farmer;
        return getName;
    }
}
