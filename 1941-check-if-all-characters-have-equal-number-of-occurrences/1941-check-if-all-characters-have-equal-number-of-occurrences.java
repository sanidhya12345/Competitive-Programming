class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }Set<Integer> set=new HashSet<>();
        for(char key:map.keySet()){
            
            set.add(map.get(key));
        }
        if(set.size()==1){
            return true;
        }
        return false;
    }
}