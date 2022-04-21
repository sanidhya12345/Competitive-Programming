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
        int [] ans=new int[arr.length];
        for(int i=0;i<ans.length-1;i++){
            ans[i]=findmax(arr,i+1);
        }
        ans[ans.length-1]=-1;
        return ans;
    }
}