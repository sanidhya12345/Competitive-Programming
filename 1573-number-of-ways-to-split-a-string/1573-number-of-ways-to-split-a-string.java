class Solution {
    public int numWays(String s) {
        long countOnes=0;
        long MOD=1_000_000_007;
        long n=s.length();
        for(char c:s.toCharArray()){
            if(c=='1'){
                countOnes++;
            }
        }
        if(countOnes%3!=0) return 0;
        if(countOnes==0) return (int)(((n-1)*(n-2)/2)%MOD);
        long oneThird=countOnes/3;
        countOnes=0;
        long ways1=0;
        long ways2=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                countOnes++;
            }
            if(countOnes==oneThird) ways1++;
            if(countOnes==2*oneThird) ways2++;
        }
        return (int)((ways1*ways2)%MOD);
    }
}