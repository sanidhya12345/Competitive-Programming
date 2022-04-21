class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> fmap=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            int freq=fmap.getOrDefault(ch,0);
            fmap.put(ch,freq+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(fmap.containsKey(ch)&&fmap.get(ch)>=1){
                int freq=fmap.get(ch);
                fmap.put(ch,freq-1);
            }else{
                return false;
            }
        }
        return true;
        
    }
}