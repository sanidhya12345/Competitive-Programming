class Solution {
     List<String> list=new ArrayList<>();
    private  void addSubstring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
    }
    private  boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        return s.equals(rev);
    }
    public int countSubstrings(String s) {
        addSubstring(s);
        int count=0;
        for(int i=0;i<list.size();i++){
            if(isPalindrome(list.get(i))){
                count++;
            }
        }
        return count;
    }
}