// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int k=0;
        int l=0;
        boolean exists=false;
        ArrayList<Integer> ll=new ArrayList<>();
        int i=0;
        for(;i<arr.length-1;i++){
            ll.add(arr[i]);
            if(arr[i]<arr[i+1]){
                exists=true;
                if(i>k){
                    k=i;
                }
            }
            if(k<i && arr[k]<arr[i]){
                l=i;
            }
        }
        ll.add(arr[i]);
        if(k<i && arr[i]>arr[k]){
            l=i;
        }
        if(!exists){
            Collections.reverse(ll);
        }
        else{
            Collections.swap(ll,k,l);
            int j=N-1;
            for(i=k+1;i<(N+k+1)/2;i++,j--){
                Collections.swap(ll,i,j);
            }
        }
        return ll;
    }
}