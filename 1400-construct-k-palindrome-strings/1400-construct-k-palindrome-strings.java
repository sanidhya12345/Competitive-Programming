class Solution {
    public boolean canConstruct(String s, int k) {
        int odd=0;
        if(s.length()<k) return false;
        else if(s.length()==k) return true;
        else{
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch:s.toCharArray()){
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }
                else{
                    map.put(ch,map.get(ch)+1);
                }
            }
            for(int i:map.values()){
                if(i%2!=0) odd++;
            }
            
        }
        return odd<=k;
        
    }
}