class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        ArrayList<Integer> listOfabsolute=new ArrayList<>();
        for(int i=0;i<word1.length();i++){
            if(!map1.containsKey(word1.charAt(i))){
                map1.put(word1.charAt(i),1);
            }
            else{
                map1.put(word1.charAt(i),map1.get(word1.charAt(i))+1);
            }
        }
        for(int i=0;i<word2.length();i++){
            if(!map2.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i),1);
            }
            else{
                map2.put(word2.charAt(i),map2.get(word2.charAt(i))+1);
            }
        }
       for(Map.Entry<Character, Integer> entry: map1.entrySet()) {
            if(Math.abs(map2.getOrDefault(entry.getKey(), 0)-entry.getValue()) > 3) {
                return false;
            }
        }
        for(Map.Entry<Character, Integer> entry: map2.entrySet()) {
            if(Math.abs(map1.getOrDefault(entry.getKey(), 0)-entry.getValue()) > 3) {
                return false;
            }
        }
        return true;
    }
}