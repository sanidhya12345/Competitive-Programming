class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        int i=0,j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target) return mid;
            else if(nums[0]<=nums[mid]){
                if(target>nums[mid] || nums[0]>target) i=mid+1;
                else j=mid-1;
            }
            else{
                if(target>nums[n-1] || nums[mid]>target){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
};