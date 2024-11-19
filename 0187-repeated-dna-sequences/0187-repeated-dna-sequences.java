class Solution {
    public static List<String> findRepeatedDnaSequences(String s) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    List<String> ans = new ArrayList<String>();
	    int n = s.length();
	    int i = 0;
	    StringBuilder sb = new StringBuilder();
	    while (i + 10 <= n) { 
	        sb.setLength(0);  
	        sb.append(s.substring(i, i + 10));  
	        
	        if (!map.containsKey(sb.toString())) {
	            map.put(sb.toString(), 1);
	        } else {
	            if (map.get(sb.toString()) == 1) {
	                ans.add(sb.toString());  
	            }
	            map.put(sb.toString(), map.get(sb.toString()) + 1);
	        }
	        
	        i++;  
	    }

	    return ans;
	}
}