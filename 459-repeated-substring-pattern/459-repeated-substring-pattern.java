class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String combine=s+s;
        int len=combine.length()-1;
        return combine.substring(1,len).contains(s);
    }
}