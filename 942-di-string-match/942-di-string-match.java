class Solution {
    public int[] diStringMatch(String s) {
        int p1 = 0, p2 = s.length();
        int ar[] = new int[s.length()+1];
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='I')
                ar[i] = p1++;
            else
                ar[i] = p2--;
        }
        ar[ar.length-1] = p1;
        return ar;
        
    }
}