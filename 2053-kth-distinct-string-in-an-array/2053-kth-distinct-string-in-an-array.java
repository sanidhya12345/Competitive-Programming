class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
    	for(String s:arr) {
    		map.put(s, map.getOrDefault(s, 0)+1);
    	}
    	int count=0;
    	for(String s:arr) {
    		if(map.get(s)==1) {
    			count++;
    		}
    		if(k==count) {
    			return s;
    		}
    	}
        return "";
    }
}