class Solution {
        public int opR(int[] nums , int mid ){
        
        int count = 0;
        for(int i : nums) count+= (i-1)/mid;
        return count;
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        
        
        int si = 1;
        int max = -(int)1e9;
        for(int i : nums) max =  Math.max(max,i);
        int ei = max;
        
        while(si<ei){
            
            int mid = (si+ei)/2;
            
            if(opR(nums,mid) > maxOperations ){
                si = mid +1;
            }else{
                ei = mid;
            }
        }
        
        return si;
        
    }
}