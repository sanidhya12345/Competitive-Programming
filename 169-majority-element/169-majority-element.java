class Solution {
    public int majorityElement(int[] a) {
        int n=a.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        int ans=0;
        for(int i:map.keySet()){
            if(map.get(i)>n/2){
                ans=i;
            }
        }
        return ans;
    }
}