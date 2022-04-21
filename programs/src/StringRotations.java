/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.Objects;

public class StringRotations {
    static ArrayList<String> ans=new ArrayList<>();
    static void printRotatedString(String str)
    {
        int len = str.length();
        StringBuffer sb;
        int flag=0;
        for (int i = 0; i < len; i++)
        {
            sb = new StringBuffer();
            int j = i;
            int k = 0;
            for (int k2 = j; k2 < str.length(); k2++) {
                sb.insert(k, str.charAt(j));
                k++;
                j++;
            }
            j = 0;
            while (j < i)
            {
                sb.insert(k, str.charAt(j));
                j++;
                k++;
            }
            ans.add(String.valueOf(sb));
        }
    }
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="ACBD";
        printRotatedString(s1);
        int flag=0;
        for(String i:ans){
            if(Objects.equals(i, s2)){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
