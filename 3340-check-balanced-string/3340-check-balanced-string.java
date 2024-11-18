class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        int i=0;
        int n=num.length();
        while(i<n){
            
            if(i%2==0){
                even+=Character.getNumericValue(num.charAt(i));
            }
            else{
                odd+=Character.getNumericValue(num.charAt(i));
            }
            i++;
        }
        return odd==even;
    }
}