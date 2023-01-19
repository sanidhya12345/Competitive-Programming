//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    private static HashSet<Character> difference(String a,String b){
        HashSet<Character> list=new HashSet<>();
        for(char ch:a.toCharArray()){
            if(b.indexOf(ch)==-1){
                list.add(ch);
            }
        }
        for(char ch:b.toCharArray()){
            if(a.indexOf(ch)==-1){
                list.add(ch);
            }
        }
        return list;
    }
    String UncommonChars(String A, String B)
    {
        // code here
        String s="";
        HashSet<Character> ls=difference(A,B);
        List<Character> list = new ArrayList<>(ls);
        Collections.sort(list);
        for(char c:list){
            s+=c;
        }
        return s.length()==0?"-1":s;
    }
}