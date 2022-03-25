class Solution {
    public int balancedStringSplit(String s) {
        int lchar=0;
        int rchar=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                rchar++;
            }
            if(ch=='L'){
                lchar++;
            }
            if(lchar==rchar){
                count++;
            }
        }
        return count;
    }
}