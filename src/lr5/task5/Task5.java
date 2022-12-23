package lr5.task5;

public class Task5 {

    private int limit;

    public Task5() {
        limit = 0;
        System.out.print("Поле равно " + limit);
    }

    public Task5(int x) {
        if (x < 100) {
            limit = x;
        } else {
            limit = 100;
        }
        System.out.print("Поле равно " + limit);
    }

}


