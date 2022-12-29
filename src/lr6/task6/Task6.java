package lr6.task6;

public class Task6 {

    static void Metod(int[] nums, int a) {
        if (a > nums.length) {
            System.out.print("\nНовый массив: ");
            int [] nums2 = new int [nums.length];
            for (int i = 0; i < nums2.length; i++) {
                nums2 [i] = nums [i];
                System.out.print(nums2[i] + " ");
            }
        } else if (a < nums.length) {
            System.out.print("\nНовый массив: ");
            int [] nums1 = new int [a];
            for (int i = 0; i < nums1.length; i++) {
                nums1 [i] = nums [i];
                System.out.print(nums1[i] + " ");
            }
        }
    }
}
