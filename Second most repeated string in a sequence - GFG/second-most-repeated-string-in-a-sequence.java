// { Driver Code Starts
//Initial Template for Java

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
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
     String secFrequent(String arr[], int N)
    {
        HashMap<String ,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])==true){
                int of=map.get(arr[i]);
                map.put(arr[i],of+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int max=0;
        for(String a : map.keySet()) {
        	if(map.get(a)>max)max=map.get(a);
        }
        
        int sec=0;
        String str ="";
        for(String a : map.keySet()) {
        	if(map.get(a)<max && map.get(a)>sec) {sec=map.get(a); str=a;}
        }
        
        return str;
    }
}