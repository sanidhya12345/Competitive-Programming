class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
         List<List<Integer>> al  = new ArrayList<>();
    HashMap<Integer,Integer> hmap = new HashMap<>();
    for(int i=0;i<items1.length;i++){
        hmap.put(items1[i][0],items1[i][1]);
    }
    for(int i=0;i<items2.length;i++){
        if(hmap.containsKey(items2[i][0]))
            hmap.put(items2[i][0],hmap.get(items2[i][0])+items2[i][1]);
        else
            hmap.put(items2[i][0],items2[i][1]);
    }
    
    for(Integer i:hmap.keySet()){
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(hmap.get(i));
        al.add(temp);
    }
    Collections.sort(al,(a,b)->a.get(0)-b.get(0));
    return al;
    }
}