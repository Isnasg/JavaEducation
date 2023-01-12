package lr7.task4;

class subClassTwo extends subClass{
    public int bird;

    subClassTwo(char a, String b, int c) {
        this.bear = a;
        this.dog = b;
        this.bird = c;
    }

    public subClassTwo(subClassTwo copy) {
        this.bear = copy.bear;
        this.dog = copy.dog;
        this.bird = copy.bird;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bear + "; String = " + this.dog
                + "; Count = " + this.bird;
        return get;
    }
}
