class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0 ; i < nums.length ; i++){
        int value = target - nums[i];
        if(map.containsKey(value)  && map.get(value) != i){
            return new int[] { map.get(value), i};
        }    
        map.put(nums[i], i);
    }  
    return null;
    }
}