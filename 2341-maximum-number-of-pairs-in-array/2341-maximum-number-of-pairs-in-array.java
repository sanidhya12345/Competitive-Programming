class Solution {
    public int[] numberOfPairs(int[] nums) {
        int [] ans=new int[2];
        if(nums.length==1){
            ans[0]=0;
            ans[1]=1;
        }
        else{
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],1);
                }   
                else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }
            
            for(int i=0;i<=100;i++){
		int val = map.getOrDefault(i,0);
		ans[0] += val/2;
		ans[1] += val%2;
	}
            
        }
        return ans;
        
    }
}