package searchl;

public class cSearchInRange {
     public static void main(String[] args) {
	    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
	    int target = 19;
	    int ans = searchrange(nums, target,2,4);
        System.out.println(ans);
	 }

	private static int searchrange(int[] nums, int target,int start,int end) {
		 int index;
            for(index=start;index<=end;index++){
                if (nums[index]==target)
                {
                    return index;
                }
            }
            return -1;

		
	}

}
