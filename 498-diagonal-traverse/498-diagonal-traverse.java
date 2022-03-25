class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<List<Integer>> ele=new ArrayList<>();
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m+n;i++){
            ele.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index=i+j+1;
                if(index%2==0){
                    ele.get(index).add(mat[i][j]);
                }
                else
                {
                    ele.get(index).add(0,mat[i][j]);
                }
            }
        }
        int [] ans=new int[m*n];
        int i=0;
        for(List<Integer> nums:ele){
            for(int num:nums){
                ans[i]=num;
                i++;
            }
        }
        return ans;
    }
}