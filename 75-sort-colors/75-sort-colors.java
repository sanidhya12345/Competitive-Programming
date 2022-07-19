class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int k=0;
        for(int i:map.keySet()){
            for(int j=0;j< map.get(i);j++){
                nums[k]=i;
                k++;
            }
        }
    }
}