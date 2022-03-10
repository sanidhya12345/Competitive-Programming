// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
            else{
                hm.put(a[i],hm.get(a[i])+1);
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>n/2){
                return i;
            }
        }
        return -1;
    }
}