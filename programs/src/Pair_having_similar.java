/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Scanner;

public class Pair_having_similar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]+1 || arr[j]==arr[i]+1 && i<j){
                        ans+=1;
                    }
            }
        }
        System.out.println(ans);
    }
}
