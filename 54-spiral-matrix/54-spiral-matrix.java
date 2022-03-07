class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        ArrayList<Integer> matrixele=new ArrayList<>();
        int m=a.length;
        int n=a[0].length;
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                matrixele.add(a[k][i]);
            }
            k++;
            for (i = k; i < m; ++i) {
                matrixele.add(a[i][n-1]);
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    matrixele.add(a[m - 1][i]);
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    matrixele.add(a[i][l]);
                }
                l++;
            }
        }
        return matrixele;
    }
}