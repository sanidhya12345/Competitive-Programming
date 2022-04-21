class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int [][] revert=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                revert[n-1-i][n-1-j]=image[n-1-i][j];
            }
        }
        return revert;
    }
}