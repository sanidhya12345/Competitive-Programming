//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java
class CustomComparator implements Comparator<Integer> {
 
    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
class Solution{
   
    public static int kthSmallest(int[] v, int l, int r, int k) 
    {   PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>(new CustomComparator());
 
    for (int i = 0; i < v.length; ++i) {
        heap1.add(v[i]);
        if (heap1.size() > k) {
            heap1.remove();
        }
    }
    return heap1.peek();
    } 
}
