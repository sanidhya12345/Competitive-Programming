class Solution {
    
    public static int binaryHelper(int [] arr,int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        for(int i=0;i<m;i++){
            int ind=binaryHelper(matrix[i],matrix[i].length,target);
            if(ind!=-1){
                return true;
            }
        }
        return false;
    }
}