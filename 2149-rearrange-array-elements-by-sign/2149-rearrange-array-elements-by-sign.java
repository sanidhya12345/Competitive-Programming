class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans=new int[nums.length];
        int oddindex=1;
        int evenIndex=0;
        for(int i:nums){
            if(i>=0){
                ans[evenIndex]=i;
                evenIndex+=2;
            }
            else{
                ans[oddindex]=i;
                oddindex+=2;
            }
        }
        return ans;
    }
}