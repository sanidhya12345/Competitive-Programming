class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s==null || t==null)
           return false;
       if(s.length()!=t.length())
           return false;
       if(s.length()==0 && t.length()==0)
           return true;
        
       HashMap<Character,Character> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
           char c1=s.charAt(i);
           char c2=t.charAt(i);
           
           Character c=getKey(map,c2);
           
           if(c!=null && c!=c1){
               return false;
           }
           else if(map.containsKey(c1)){
               if(c2!=map.get(c1)){
                   return false;
               }
           }
           else{
               map.put(c1,c2);
           }
       }
        return true;
    }
    
    private Character getKey(HashMap<Character,Character> map,Character target){
        for(Map.Entry<Character,Character> entry:map.entrySet()){
            if(entry.getValue().equals(target)){
                return entry.getKey();
            }
        }
        return null;
    }
}