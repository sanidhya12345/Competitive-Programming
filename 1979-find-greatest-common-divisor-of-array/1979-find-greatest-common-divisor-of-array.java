class Solution {
    public static int gcd(int a, int b)  
    {  
        while(b != 0)  
        {  
            if(a > b)  
            {  
                a = a - b;  
            }  
            else  
            {  
                b = b - a;  
            }  
        }  
       return a;  
     }
    public int findGCD(int[] nums) {
        if(nums.length==2){
            return gcd(nums[0],nums[1]);
        }
        Arrays.sort(nums);
        int low=nums[0];
        int high=nums[nums.length-1];
        return gcd(low,high);
    }
}