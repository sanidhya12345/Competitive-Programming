/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Scanner;

public class Rida_hussein {
    private static int ans(int [][] floors,int rows,int cols){
        int res=0;
        for(int i=0;i<rows;i++){
            for (int j = 0; j <cols ; j++) {
                int rita=floors[i][j];
                int hus=floors[i][cols-1-j];
                if(rita!=hus){
                    res+=hus;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] floors=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j = 0; j <cols ; j++) {
                floors[i][j]= sc.nextInt();
            }
        }
        int result=ans(floors,rows,cols);
        System.out.println(result);
    }
}
