class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target) return mid;
            else if(nums[i]<=nums[mid]){
                // i to mid is sorted
                // left part is sorted
                if(nums[i]<=target && nums[mid]>target){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else if(nums[mid]<=nums[j]){
                // mid to j is sorted
                // right part is sorted
                if(nums[mid]<target && nums[j]>=target){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}