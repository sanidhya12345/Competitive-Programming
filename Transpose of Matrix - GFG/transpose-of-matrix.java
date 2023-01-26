//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int a[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(st[k++]);

            Solution ob = new Solution();
            ob.transpose(a, n);
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n;j++)
                    System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        // code here
       int [][] ans=new int[n][n];
       for(int j=0;j<n;j++){
           for(int i=0;i<n;i++){
               ans[i][j]=matrix[j][i];
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               matrix[i][j]=ans[i][j];
           }
       }  
    }
}