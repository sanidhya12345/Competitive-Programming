class Solution {
    public int[] productExceptSelf(int[] nums) {
       int res[]=new int[nums.length];
        int left=1;
        res[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            left*=nums[i-1];
            res[i]=left;
        }
        int right=1;
       for(int i=(nums.length-2);i>=0;i--)
       {
           right*=nums[i+1];
           res[i]*=right;
       }
        
       
        return res;
    }
}