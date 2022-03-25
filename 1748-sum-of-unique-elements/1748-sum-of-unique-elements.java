class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],1);
            }
            else{
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
        }
        int sum=0;
        for(int i:hmap.keySet()){
            if(hmap.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
}