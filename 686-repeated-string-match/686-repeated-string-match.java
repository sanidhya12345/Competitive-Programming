class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb =new StringBuilder();int ans=0;
        while(sb.length()<b.length())
        {
        	ans++;
        	sb.append(a);
        }
        
        if(sb.toString().contains(b)) // indexOf method of String Builder can also be used
        	return ans;
        
        sb.append(a);
        if(sb.toString().contains(b))
        	return ans+1;
        
        return -1;
    }
}