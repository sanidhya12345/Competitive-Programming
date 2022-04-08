class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> answer = new ArrayList<>();
        for(int i=0;i<matrix.length;i++) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean flag = true;
            for(int j=0;j<matrix.length;j++) {
                if(matrix[i][minIndex] < matrix[j][minIndex]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer.add(matrix[i][minIndex]);
            }
        }
        return answer;
    }
}