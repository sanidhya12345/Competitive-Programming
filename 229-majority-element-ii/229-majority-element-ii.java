class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }
        return list;   
    }
}