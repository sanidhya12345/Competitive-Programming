/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LongestPalindromeString {
    public static String reverse(String s,String ans,int i){
        if(i==-1){
            return ans;
        }
        return reverse(s,ans+s.charAt(i),i-1);
    }
    static String longestPalin(String s){
        // code here
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String sub=s.substring(i);
            if(reverse(sub,"",sub.length()-1).equals(sub)){
                ar.add(sub);
            }
        }
        if(ar.size()==1){
            return String.valueOf(s.charAt(0));
        }
        Collections.sort(ar);
        String ans=ar.get(ar.size()-1);
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "rfkqyuqfjkxy";
        String s="aaaabbaa";
        System.out.println(longestPalin(s1));
    }
}
