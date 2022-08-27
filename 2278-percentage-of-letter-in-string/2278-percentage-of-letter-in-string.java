class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==letter) 
            {
                count++;
            }
        }
        int perc=(count*100/s.length());
        return Math.round(perc);
    }
}