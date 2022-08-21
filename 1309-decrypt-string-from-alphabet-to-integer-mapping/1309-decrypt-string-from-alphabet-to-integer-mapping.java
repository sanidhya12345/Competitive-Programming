class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
    int num = 0;
        for(int i=s.length() - 1; i>=0; i--) {
        if(s.charAt(i) == '#')
        {
            num = (s.charAt(i-1) - '0') + (s.charAt(i-2) - '0')*10;
            i-=2;
        } else {
            num = s.charAt(i) - '0';
        }

        res.append((char)('a' + num - 1));
    }
        
        
        return res.reverse().toString();
    }
}