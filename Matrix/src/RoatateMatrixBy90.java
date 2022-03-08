/*
 * Copyright (c) 3-3/8/22, 7:48 PM by Sanidhya Varshney
 */

public class RoatateMatrixBy90 {
    static void reverseArray(int arr[][],int N) {
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        reverseArray(matrix,3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
