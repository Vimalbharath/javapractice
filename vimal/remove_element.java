package vimal;
// https://leetcode.com/problems/remove-element/
// retuning only the index of element not equal to val

class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
            nums[index]=nums[i] ;
            index++;
            }
        }
        return index;
    }

}
