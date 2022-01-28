package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static long Areaofhistogram(long[] arr) {
        Stack<Integer> st = new Stack<>();
        long maxarea = 0;
        for (int i = 0; i < arr.length;) {
            if (st.isEmpty() || arr[i] > arr[st.peek()]) {
                st.push(i);
                i++;
            }

            else {
                int r = i;
                long h = arr[st.pop()];
                if (st.isEmpty()) {
                    long pa = h * r;
                    maxarea = Math.max(maxarea, pa);
                } else {
                    long l = st.peek();
                    long pa = h * (r - l - 1);
                    maxarea = Math.max(maxarea, pa);
                }

            }


        }
        long r = arr.length;
        while (!st.isEmpty()) {
            long h = arr[st.pop()];
            if (st.isEmpty()) {
                long pa = h * r;
                maxarea = Math.max(maxarea, pa);
            } else {
                long l = st.peek();
                long pa = h * (r - l - 1);
                maxarea = Math.max(maxarea, pa);
            }
        }
        return maxarea;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr =new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(Areaofhistogram(arr));

    }

}
