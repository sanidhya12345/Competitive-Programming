// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int a[][], int m, int n)
    {
        // code here 
        ArrayList<Integer> matrixele=new ArrayList<>();
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
