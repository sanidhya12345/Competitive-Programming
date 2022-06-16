// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        
        int n=s.length()+1;
        int m=t.length()+1;
        
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            arr[i][0]=i;
        }
        
        for(int j=0;j<m;j++){
            arr[0][j]=j;
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=(int)Math.min((int)Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1])+1;
                }
            }
        }
        return arr[n-1][m-1];
    }
}