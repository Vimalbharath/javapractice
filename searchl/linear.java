package searchl;

public class linear {
        public static void main(String[] args) {
	    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
	    int target = 19;
	    boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }

        private static boolean linearSearch3(int[] nums, int target) {
            if (nums.length==0)
            {
                return false;
            }
            for(int element: nums){
                if(element== target){
                    return true;
                }
            }
            return false;
        }

        private static int linearSearch2(int[] nums, int target) {
            int index;
            for(index=0;index<nums.length;index++){
                if (nums[index]==target)
                {
                    return nums[index];
                }
            }
            return Integer.MIN_VALUE;
        }

        private static int linearSearch1(int[] nums, int target) {
            int index;
            for(index=0;index<nums.length;index++){
                if (nums[index]==target)
                {
                    return index;
                }
            }
            return -1;
        }

}
