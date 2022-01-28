package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Next_greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            NextGreaterElement(arr);
            t-=1;
        }
    }

    public static void NextGreaterElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int nge[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                nge[s.pop()] = arr[i];

            }

            s.push(i);
        }

        while(!s.isEmpty()) {
            nge[s.pop()]=-1;
        }

        for (int i = 0; i < nge.length; i++) {
            System.out.println(arr[i] + "," + nge[i]);
        }
    }
}
