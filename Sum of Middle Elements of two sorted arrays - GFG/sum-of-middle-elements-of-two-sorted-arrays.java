//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        int i = 0;  
        int j = 0; 
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++)
        {
            if (i == n)
            {
                m1 = m2;
                m2 = ar2[0];
                break;
            }
     
            else if (j == n)
            {
                m1 = m2;
                m2 = ar1[0];
                break;
            }
            if (ar1[i] <= ar2[j])
            {   
                m1 = m2;  
                m2 = ar1[i];
                i++;
            }
            else
            {
                m1 = m2;  
                m2 = ar2[j];
                j++;
            }
        }
        return m1+m2;
    }
}