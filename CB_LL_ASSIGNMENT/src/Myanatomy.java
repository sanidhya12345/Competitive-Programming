/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Myanatomy {
    public static int countWealthyMove(int [] a,int n){
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] copy = new int[n];
        for (int i = 0; i<n; i++) {
            copy[i] = a[i];
        }
        Arrays.sort(copy);
        for (int i = 0; i<n; i++) {
            m.put(copy[i], i + 1);
        }
        int moves = 0;
        for (int i = 0; i<n; i++) {
            if ((i + 1) != (int) m.get(a[i])) {
                int temp = a[i];
                int pos = m.get(a[i]) - 1;
                a[i] = a[pos];
                a[pos] = temp;
                moves++;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=countWealthyMove(arr,n);
        System.out.println(result);
    }
}
