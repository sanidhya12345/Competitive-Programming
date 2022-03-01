/*
 * Copyright (c) 3-3/1/22, 6:24 PM by Sanidhya Varshney
 */

import java.util.Scanner;

public class CandiesDistribution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0){
           long n=sc.nextLong();
           if(n%2==0){
               System.out.println(n/2-1);
           }
           else{
               System.out.println(n/2);
           }
        }
    }
}
