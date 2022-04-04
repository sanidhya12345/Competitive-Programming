class Solution {
    public int countPoints(String rings) {
         HashMap<Character, String> map= new HashMap<>();

        for(int i = 0; i < rings.length(); i+=2) {
            if(map.containsKey(rings.charAt(i+1))) {
                map.put(rings.charAt(i+1), map.get(rings.charAt(i+1)) + rings.charAt(i));
            } else {
                map.put(rings.charAt(i+1), String.valueOf(rings.charAt(i)));
            } 
        }
        int count=0;
        for(char key:map.keySet()){
            String value=map.get(key);
            Set<Character> set=new HashSet<>();
            
            for(int i=0;i<value.length();i++){
                set.add(value.charAt(i));
            }
            if(set.size()==3){
                count++;
            }
        }
        return count;
    }
}