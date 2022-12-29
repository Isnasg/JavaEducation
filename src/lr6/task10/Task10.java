package lr6.task10;

public class Task10 {
    static void Metod(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max =  nums [i];
            } if (nums[i] < min) {
                min =  nums [i];
            }
        }
        System.out.println("\nМаксмальное из массива = " + max);
        System.out.println("Минимальное из массива = " + min);
    }
}
