class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       HashMap<Character, String> map = new HashMap<>();
        char ch ='a';
        for(int i =0;i<26;i++)
        {
            map.put('a',".-" );
            map.put('b', "-...");
            map.put('c' ,"-.-.");
            map.put('d',"-..");
            map.put('e',".");
            map.put('f',"..-.");
            map.put('g',"--.");
            map.put('h',"....");
            map.put('i',"..");
            map.put('j',".---");
            map.put('k',"-.-");
            map.put('l',".-..");
            map.put('m',"--");
            map.put('n',"-.");
            map.put('o',"---");
            map.put('p',".--.");
            map.put('q',"--.-");
            map.put('r',".-.");
            map.put('s',"...");
            map.put('t',"-");
            map.put('u',"..-");
            map.put('v',"...-");
            map.put('w',".--");
            map.put('x',"-..-");
            map.put('y',"-.--");
            map.put('z',"--..");
        }
        
        int res =0;
        HashSet<String> set = new HashSet<>();
        for(String s : words)
        {   StringBuilder sb = new StringBuilder();
            for(int i =0;i<s.length();i++)
            {
                char c = s.charAt(i);
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}