package searchsort;

//https://leetcode.com/problems/find-the-duplicate-number/

public class gFindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        miss(nums);
        // swap(nums,)
        System.out.println(miss(nums));
    }

    private static int miss(int[] nums) {
        int i = 0;

        while (i < nums.length) {

            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                int a = i++;

            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
