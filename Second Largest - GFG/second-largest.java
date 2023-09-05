//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getMax(HashMap<Integer,Boolean> map){
        int max=Integer.MIN_VALUE;
        for(int i:map.keySet()){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
    int print2largest(int arr[], int n) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,true);
            }
        }
        map.remove(getMax(map));
        if(getMax(map)==Integer.MIN_VALUE){
            return -1;
        }
        return getMax(map);
    }
}