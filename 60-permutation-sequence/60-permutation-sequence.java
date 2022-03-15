class Solution {
    public String solve(String ans, String rem, int k, int[] perm, int sum) {
        if(rem.equals("")) {
            return ans;
        }
        
        for(int i=0; i<rem.length(); i++) {
            
            if(k<sum+perm[rem.length()-1] && k>=sum) {
                return solve(ans+rem.charAt(i), rem.substring(0, i) + rem.substring(i+1), k, perm, sum);
            }
            sum+=perm[rem.length()-1];
        }
        return "";
    }
    
    
    
    public String getPermutation(int n, int k) {
        int[] perm = new int[]{1,1,2,6,24,120,720,5040,40320, 362880};
        String s = "";
        for(int i=1; i<=n; i++) {
            s = s+i;
        }
        return solve("", s, k, perm, 1);
    }
}