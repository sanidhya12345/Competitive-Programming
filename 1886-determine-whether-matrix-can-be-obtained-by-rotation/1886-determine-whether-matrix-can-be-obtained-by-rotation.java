class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
         for(int i = 0; i < 4; i++){
            mat = Rotation(mat);
            if (Arrays.deepEquals(target, mat) == true) 
                return true;  
           }
           return false; 
    }   
    static int[][] Rotation(int matrix[][]) {
        int[][] newarray = new int[matrix.length][matrix.length];
        int p;
            for (int i = 0; i < newarray.length; i++) {
                p = matrix.length - 1;
                for (int j = 0; j < newarray.length; j++, p--) 
                    newarray[i][j] = matrix[p][i];
            }
            return newarray;   
    }
}