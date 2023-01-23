//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            
            if(!stk.isEmpty() && stk.peek().equals(c)){
                stk.pop(); 
            }else{
                stk.push(c);
            }
        }
        
        while(stk.size() > 0){
            sb.insert(0, stk.pop()); 
        }
        if(sb.toString().length()==0){
            return "-1";
        }
        
        return sb.toString();
    }
}
        
