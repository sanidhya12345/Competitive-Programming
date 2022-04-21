/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Scanner;

public class In_an_array {
    public static long pair(int [] arr,int k,int x,int y){
        long ans=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if((arr[i]+arr[j])%k==x &&(arr[i]*arr[j])%k==y){
                    ans+=1;
                }
            }
        }
        return ans/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x= sc.nextInt();
        int y=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(pair(arr,k,x,y));
    }
}
