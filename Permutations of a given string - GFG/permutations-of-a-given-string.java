//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    static Set<String> set=new HashSet<>();
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private static void permute(String s,int start,int end){
        if(start==end){ 
           set.add(s);
        }
        else{
            for(int i=start;i<=end;i++){
                s=swap(s, start, i);
                permute(s, start+1, end);
                s=swap(s, start, i);
            }
        }
    }
    public List<String> find_permutation(String s) {
        // Code here
        permute(s,0,s.length()-1);
        List<String> list=new ArrayList<>();
        for(String i:set){
            list.add(i);
        }
        set.clear();
        Collections.sort(list);
        return list;
    }
}