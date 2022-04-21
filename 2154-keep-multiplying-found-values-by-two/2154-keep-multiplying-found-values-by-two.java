class Solution {
    private boolean find(int [] nums,int value){
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==value){
                check=1;
                break;
            }
        }
        if(check==1) return true;
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        while(find(nums,original)){
            original*=2;
        }
        return original;
    }
}