class Solution {
    private boolean isHashString(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int count=0;
        for(char i:map.keySet()){
           if(map.get(i)==1){
                count++;
            }
        }
        return count==s.length();
    }
    public int countGoodSubstrings(String s) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            list.add(s.substring(i,i+3));
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(isHashString(list.get(i))) count++;
        }
        return count;
    }
}