class Solution {
    public String decodeMessage(String key, String message) {
        char ch='a';
        HashMap<Character,Character> map=new HashMap<>();
        map.put(' ',' ');
        for(int i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            if(!map.containsKey(c) && c!=' ')
            {
                map.put(c,ch);
                ch++;
            }
        }
        String ans="";
        for(char c:message.toCharArray()){
            ans+=map.get(c);
        }
        return ans;
    }
}