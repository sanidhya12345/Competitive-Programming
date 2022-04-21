/*
 * Copyright (c) 3/10/22, 9:29 AM by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static ArrayList<Integer> al=new ArrayList<>();
    public static int intcalpow(int num,int pow){
        if(pow==0){
            return 1;
        }
        return num*intcalpow(num,pow-1);
    }
    public static List<Integer> number(int n){
        List<Integer> dup=new ArrayList<>();
        while(n!=0){
            int m=n%10;
            dup.add(m);
            n=n/10;
        }
        return dup;
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            int val=al.get(i);
            ans.add(number(val));
        }
        return ans;
    }
    public static void main(String[] args) {
        int rows=6;
        for (int i=0;i<6;i++){
            al.add(intcalpow(11,i));
        }
        System.out.println(al);
        System.out.println(generate(rows));
    }
}
