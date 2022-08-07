class Solution {
    private boolean checkLowercase(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                count++;
            }
        }
        return count==s.length();
    }
    private boolean checkUppercase(String s){
        int count=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        return count==s.length();
    }
    private boolean isTitle(String s){
        return Character.isUpperCase(s.charAt(0)) && checkLowercase(s.substring(1));
    }
    public boolean detectCapitalUse(String word) {
        if(checkLowercase(word)){
            return true;
        }
        if(checkUppercase(word)){
            return true;
        }
        if(isTitle(word)){
            return true;
        }
        return false;
    }
}