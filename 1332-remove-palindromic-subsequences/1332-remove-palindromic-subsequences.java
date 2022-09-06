class Solution {
    private static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public int removePalindromeSub(String s) {
        if(isPalindrome(s)){
            return 1;
        }
        if(s.length()==0) return 0;
        
        return 2;
       
    }
}