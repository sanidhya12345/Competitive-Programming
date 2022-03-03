// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        // code here
        String ans=reverse(s,"",s.length()-1);
        if(ans.equals(s)){
            return 1;
        }
        return 0;
        
    }
    public  String reverse(String s,String ans,int i){
        if(i==-1){
            return ans;
        }
        return reverse(s,ans+s.charAt(i),i-1);
    }
};