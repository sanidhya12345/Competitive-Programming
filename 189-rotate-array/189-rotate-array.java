class Solution {
     public void rotate(int[] arr, int d) {
        int n = arr.length;
        d= d%n;
        reverse(arr,0,n-d);
        reverse(arr,n-d,n);
        reverse(arr,0,n);
    
    }   
  
     private void reverse(int []arr,int start, int end){
        int j = end-1;
        for(int i= start;i<j;i++){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j--;
        }
    }
}