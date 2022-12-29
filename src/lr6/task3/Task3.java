package lr6.task3;

public class Task3 {

    static void Metod(int[] nums) {
        int max = nums[0], min = nums[0], score = nums[0];
        float sred;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max =  nums [i];
            } if (nums[i] < min) {
                min =  nums [i];
            }
            score += nums[i];
        }
        sred = (float) score/ nums.length;
        System.out.println("\nМаксмальное из массива = " + max);
        System.out.println("Минимальное из массива = " + min);
        System.out.println("Среднее из всех чисел масива = " + sred);
    }
}
