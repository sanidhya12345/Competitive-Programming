/*
 * Copyright (c) 3/19/22, 10:04 AM by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.HashMap;

public class removeadjacent {
    private static void remove(String s,int k){
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),1);
            }
            else{
                hmap.put(s.charAt(i),Math.abs((hmap.get(s.charAt(i))+1)-k));
            }
        }
        System.out.println(hmap);
    }
    private static void del(String s,int k){
        ArrayList<Character> val=new ArrayList<>();
        String ans="";
        int i=0;
        for(int j=1;j<s.length();j++){
            if(s.charAt(i)!=s.charAt(j)){
                ans+=s.charAt(i);
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s="abbaca";
        del(s,3);
    }
}
