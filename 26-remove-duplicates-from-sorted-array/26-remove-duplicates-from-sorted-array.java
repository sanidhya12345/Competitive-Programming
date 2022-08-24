class Solution {
    public int removeDuplicates(int[] nums) {
        int countduplicates=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) countduplicates++;
            nums[i-countduplicates]=nums[i];
        }
        return nums.length-countduplicates;
    }
}