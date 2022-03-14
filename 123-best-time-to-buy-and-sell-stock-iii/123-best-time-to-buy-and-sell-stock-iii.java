//Bidirectional Dynamic Programming.
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [] left=new int[n];
        int [] right=new int[n];
        int max=prices[n-1];
        int min=prices[0];
        if(n==0){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(prices[i]<min){
               min=prices[i];
            }
            int profit=prices[i]-min;
            left[i]=Math.max(left[i-1],profit);
        }
        for(int i=n-2;i>=0;i--){
            if(prices[i]>max){
               max=prices[i];
            }
            int profit=max-prices[i];
            right[i]=Math.max(right[i+1],profit);
        }
        int maxProfit=0;
        for(int i=0;i<n;i++){
            maxProfit=Math.max(maxProfit,left[i]+right[i]);
        }
        return maxProfit;
    }
}