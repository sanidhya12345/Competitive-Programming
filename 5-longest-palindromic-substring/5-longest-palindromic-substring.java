class Solution {
    public boolean palindrome(String S, int start, int end){
        
        while(start <= end){
            
            if(S.charAt(start) == S.charAt(end)){
                start++;
                end--;
            } else{
                return false;
            }
            
        }
        
        return true;
        
    }
    public String longestPalindrome(String S) {
        
        int longest = 1, index = 0;
        
        for(int i = 0; i < S.length(); i++){
            
            for(int j = i; j < S.length(); j++){
                
                if(longest < (j - i + 1) && palindrome(S, i, j) == true){
                    longest = j - i + 1;
                    index = i;
                }
                
            }
        }
        
        return S.substring(index, index + longest);
    }
}