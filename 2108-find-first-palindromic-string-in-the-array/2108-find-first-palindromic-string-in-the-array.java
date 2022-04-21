class Solution {
    private boolean Ispalindrome(String original){
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        return reverse.equals(original);
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            if(Ispalindrome(words[i])){
                ans+=words[i];
                break;
            }
        }
        return ans;
    }
}