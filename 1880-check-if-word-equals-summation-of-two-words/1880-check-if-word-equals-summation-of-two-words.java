class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<10;i++){
            char key=(char)('a'+i);
            map.put(key,i);
        }
        String val1="";
        String val2="";
        String val3="";
        for(char ch:firstWord.toCharArray()){
            val1+=map.get(ch);
        }
        for(char ch:secondWord.toCharArray()){
            val2+=map.get(ch);
        }
        for(char ch:targetWord.toCharArray()){
            val3+=map.get(ch);
        }
        int fw=Integer.parseInt(val1);
        int sw=Integer.parseInt(val2);
        int tw=Integer.parseInt(val3);
        return fw+sw==tw;
    }
}