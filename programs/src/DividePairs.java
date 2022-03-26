/*
 * Copyright (c) 3-3/26/22, 6:24 PM by Sanidhya Varshney
 */

import java.util.*;

public class DividePairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int boxes=sc.nextInt();
        int q=sc.nextInt();
        int [] arr=new int[boxes];
        while(q--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<boxes && a!=b){
                arr[a]=1;
            }
        }
        int count=0;
        for (int j : arr) {
            count += j;
        }
        System.out.println(count);
    }
}
