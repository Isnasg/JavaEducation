package lr7.task4;

class subClass extends superClass{
    public String dog;

    subClass(char a, String b) {
        this.bear = a;
        this.dog = b;
    }

    subClass() {
    }

    public subClass(subClass copy) {
        this.bear = copy.bear;
        this.dog = copy.dog;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bear + "; String = " + this.dog;
        return get;
    }

}
