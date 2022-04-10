class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> sol=generate(rowIndex+1);
        List<Integer> ans = sol.get(rowIndex);
        return ans;
    }
    public  List<List<Integer>> generate(int numRows) {
       if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                }
                else {
                    row.add(ans.get(i - 2).get(j) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}