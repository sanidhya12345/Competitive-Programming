/*
 * Copyright (c) 3-3/5/22, 6:52 PM by Sanidhya Varshney
 */

import java.util.ArrayList;

public class FindSubsequenceofstring {
    static ArrayList<String> an=new ArrayList<>();
    public static void subsequeces(String s,String ans,int i,int n){
        if(i==n){
            an.add(ans);
        }
        else{
            subsequeces(s,ans,i+1,n);
            ans+=s.charAt(i);
            subsequeces(s,ans,i+1,n);
        }
    }
    public static void main(String[] args) {
        String a="abcd";
        subsequeces(a,"",0, a.length()-1);
        System.out.println(an);
    }
}
