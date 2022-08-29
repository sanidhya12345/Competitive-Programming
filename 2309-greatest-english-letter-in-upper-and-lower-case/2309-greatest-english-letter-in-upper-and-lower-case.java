class Solution {
    public String greatestLetter(String s) {
        String result="";
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];

        for(char c:s.toCharArray()){
            if(c >= 65 && c <=90){
                upperCase[(int)(c-65)]++;
            } else if(c >= 97 && c <=122){
                lowerCase[(int) (c-97)]++;
            }
        }

        for(int i=0;i<26;i++){
            if(upperCase[i] != 0 && lowerCase[i] !=0){
                result = ((char)(i+65))+"";
            }
        }
        return result;
    }
}