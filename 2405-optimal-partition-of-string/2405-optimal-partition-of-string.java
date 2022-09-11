class Solution {
    public int partitionString(String s) {
       int ans = 1;
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
            }
            else{
                ans++;
                st.clear();
                st.add(s.charAt(i));
            }
        }
        return ans;
    }
}