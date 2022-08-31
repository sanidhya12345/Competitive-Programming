class Solution {
    public int[] twoSum(int[] num, int target) {
         int start = 0;
    int end = num.length-1;
    
    while(start < end){
        
        if(num[start] + num[end] == target){
            return new int[]{start+1 , end+1};
        }
        
        if(num[start] + num[end] < target){      
              start++;      
        }
        
        if(num[start] + num[end] > target){    
              end--;      
        }
        
    }
    return new int[]{-1,-1};
    }
}