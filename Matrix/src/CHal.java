/*
 * Copyright (c) 3/13/22, 5:57 PM by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CHal {
    static ArrayList<Integer> ar=new ArrayList<>();
    static void printSubArray(int arr[]) {
        //ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    ar.add(arr[k]);
                }
            }
        }
    }
    static int xorOfArray(int arr[], int n)
    {
        int xor_arr = 0;
        for (int i = 0; i < n; i++) {
            xor_arr = xor_arr ^ arr[i];
        }
        return xor_arr;
    }
    public static void main(String[] args) {
        int n=4;
        int [] a={1,4,3,9};
        int q=2;
        int [] ans=new int[q];
        int [][] queries={{3,5},{1,5}};
        for(int i=0;i<q;i++){
            a[queries[i][0]]=queries[i][1];
            printSubArray(a);
            System.out.println(ar);
        }
    }
}
