class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i< n ;i++){
            Set<Integer> sr = new HashSet<Integer>();
            Set<Integer> sc = new HashSet<Integer>();
            for(int j = 0;j<n ; j++){
                sr.add(matrix[i][j]);
                sc.add(matrix[j][i]);
            }
            if(sr.size()!=n || sc.size()!=n) return false;
        }
        return true;
    }
}