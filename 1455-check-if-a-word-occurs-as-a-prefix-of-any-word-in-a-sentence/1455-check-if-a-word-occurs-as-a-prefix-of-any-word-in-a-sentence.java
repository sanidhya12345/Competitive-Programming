class Solution {
    public boolean isPrefix(String s,String target){
        return s.startsWith(target);
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}