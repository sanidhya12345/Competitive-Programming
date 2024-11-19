class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
    	 //map is used to find the number of crack at what distance at each rows.
    	 HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    	 int rows=wall.size();
    	 
    	 for(int i=0;i<wall.size();i++){
             List<Integer> listEle=wall.get(i);
             int sum=0;
             for(int j=0;j<listEle.size()-1;j++){
                 sum=sum+listEle.get(j);
                 map.put(sum,map.getOrDefault(sum, 0)+1);
             }
         }
    	 
    	 int min=rows;
    	 for(Integer key:map.keySet()) {
    		 min=Math.min(min,wall.size()-map.get(key));
    	 }
    	 
    	 return min;
     }
}