class Solution {
    public int[] sumZero(int n) {
       int [] ans=new int[n];
        if(n%2!=0){
            int mid=n/2;
            ans[mid]=0;
            for(int i=0;i<n/2;i++){
                ans[i]=-mid;
                mid-=1;
            }
            mid=1;
            for(int i=n/2+1;i<n;i++){
                ans[i]=mid;
                mid+=1;
            }
        }
        else{
            int mid=n/2;
            int j=1;
            for(int i=0;i<n/2;i++){
                ans[i]=-mid;
                mid-=1;
            }
            for(int i=n/2;i<n;i++){
                ans[i]=j;
                j++;
            }
        }
        return ans;
    }
}