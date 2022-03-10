// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long[] nums1 = new long[n];
        for(int i = 0; i<n ; i++){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            long mul = 1;
            for(int j=1;j<n;j++){
                mul = mul * arr[j];
            }
            nums1[i] = mul;
            int temp1 = arr[i];
            arr[i] = arr[0];
            arr[0] = temp1;
        }
        return nums1;
	} 
} 
