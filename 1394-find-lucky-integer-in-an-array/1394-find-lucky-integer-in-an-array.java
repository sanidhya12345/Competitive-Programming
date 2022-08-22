class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(i==map.get(i)){
                list.add(i);
            }
        }
        if(list.size()==0) return -1;
        return Collections.max(list);
    }
}