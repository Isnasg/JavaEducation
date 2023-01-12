package lr7.task5;

class superClass {

    protected String sheep;

    superClass() {

    }

    superClass(String a) {
        this.sheep = a;
    }

    @Override
    public String toString() {
        String getName = "Name = " + this.getClass().getSimpleName() + " String = " + this.sheep;
        return getName;
    }

    public void check(subClassOne two, subClassTwo three) {
        System.out.println(((subClassOne) two).toString());
        System.out.println(((subClassTwo) three).toString());
    }
}
