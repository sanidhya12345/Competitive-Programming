class Solution {
    public int findMin(int[] nums) {
       int s = 0;
    int e = nums.length-1;
    
    while(s<=e){
        
        int m = s + (e-s)/2;
        
        if(m<nums.length-1 && nums[m]>nums[(m+1)]){      
            return nums[(m+1)];
        }
        if(nums[s]<=nums[m]){        
            s = m+1;
        }
        else e = m-1;
    }
    return nums[0];
    }
}