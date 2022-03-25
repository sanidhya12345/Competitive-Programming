class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> frequency=new HashMap<>();
        int length=nums.length-1;
        for(int i=0;i<=length;i++){
            if(!frequency.containsKey(nums[i])){
                frequency.put(nums[i],1);
            }
            else{
                frequency.put(nums[i],frequency.get(nums[i])+1);
            }
        }
        int ans=0;
        int maxValueInMap=(Collections.max(frequency.values())); 
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {  
            if (entry.getValue()==maxValueInMap) {
                ans+=entry.getKey();   
            }
        }
        return ans;
    }
}