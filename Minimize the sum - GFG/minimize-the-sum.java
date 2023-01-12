//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int n, int arr[]) {
       int i;
       long sum = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (i = 0; i < n; i++)
            pq.add((long)arr[i]);
        while (pq.size() > 1)
        {
 
            long min = pq.poll();
            long secondMin = pq.poll();
            sum += (min + secondMin);
            pq.add(min + secondMin);
        }
        return sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends