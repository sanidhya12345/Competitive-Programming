class Solution {
    public static int totalHours(int []arr,int n,int k){
        int totalHrs=0;
        for(int i=0;i<n;i++){
            totalHrs += (arr[i] + k - 1) / k;
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n=arr.length;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1];
        while (low<high) {
            int mid=(low+high)/2;
            int totalHrs=totalHours(arr, n, mid);
            if(totalHrs<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}