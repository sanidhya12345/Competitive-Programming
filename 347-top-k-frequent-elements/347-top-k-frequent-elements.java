class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],1);
            }
            else{
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
        }
        
        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            int maximum=0;
            int ele=0;
            for(Integer key:hmap.keySet()){
                if(hmap.get(key)>maximum){
                    maximum=hmap.get(key);
                    ele=key;
                }
            }
            ans[i]=ele;
            hmap.put(ele,0);
        }
        return ans;
    }
}