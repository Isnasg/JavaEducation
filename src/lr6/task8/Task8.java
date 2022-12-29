package lr6.task8;

public class Task8 {
    static void Metod(int[] nums) {
        int score = 0;
        float sred;
        for (int i = 0; i < nums.length; i++) {
            score += nums[i];
        }
        sred = (float) score/ nums.length;
        System.out.println("\nСреднее из всех чисел масива = " + sred);
    }
}
