class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                int pivot=i-1;
                while(i<nums.length&& nums[pivot]<nums[i]){
                    i++;
                }
                swap(nums,pivot,i-1);
                reverse(nums,pivot+1);
                return;
            }
        }
        reverse(nums,0);
        
    }
    private void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int [] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}