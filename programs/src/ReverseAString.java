/*
 * Copyright (c) 3-3/3/22, 6:55 PM by Sanidhya Varshney
 */

public class ReverseAString {
    public static String reverse(String s,String ans,int i){
        if(i==-1){
            return ans;
        }
        return reverse(s,ans+s.charAt(i),i-1);
    }
    public static void main(String[] args) {
        String s="ashish";
        String res=reverse(s,"",s.length()-1);
        System.out.println(res);
    }
}
