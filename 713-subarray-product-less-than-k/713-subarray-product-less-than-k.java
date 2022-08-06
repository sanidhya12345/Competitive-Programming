class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int start=0;
        int product=1;
        int res=0;
        for(int end=0;end<arr.length;end++){
            product*=arr[end];
            while(start<end && product>=k){
                product/=arr[start++];
            }
            if(product<k){
                int len=end-start+1;
                res+=len;
            }
        }
        return res;
    }
}