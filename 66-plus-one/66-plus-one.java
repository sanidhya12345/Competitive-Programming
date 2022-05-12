class Solution {
     public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]==10){
                carry=1;
                digits[i]=0;
            }
            else{
                carry=0;
                break;
            }
        }
        
        if(carry==1){
            int temp[]=new int[n+1];
            temp[0]=1;
            return temp;
        }
        return digits;
    }
}