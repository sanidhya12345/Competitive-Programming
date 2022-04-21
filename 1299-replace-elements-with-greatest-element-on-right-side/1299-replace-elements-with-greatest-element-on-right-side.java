class Solution {
     private int findmax(int [] arr,int index){
        int max=arr[index];
        for(int i=index;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            arr[i]=findmax(arr,i+1);
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}