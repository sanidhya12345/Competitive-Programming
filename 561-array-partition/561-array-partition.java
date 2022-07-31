class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        int sum=0;
        for(int i=0;i<nums.length-1;i+=2){
            sum+=Math.min(nums[i],nums[j]);
            j+=2;
        }
        return sum;
    }
}