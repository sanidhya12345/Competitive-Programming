package CodingBlocks.src;

import java.util.Scanner;
import java.util.Stack;

public class Find_Greater_Element {
    static void printNGE(int arr[], int n)
    {

        Stack<Integer> s = new Stack<>();
        int nge[] = new int[n];
        int i = 0;

        for(i = 0; i < n; i++)
        {
            nge[i] = -1;
        }
        i = 0;

        while (i < 2 * n)
        {


            while (!s.isEmpty() &&
                    arr[i % n] > arr[s.peek()])
            {


                nge[s.peek()] = arr[i % n];


                s.pop();
            }
            s.push(i % n);
            i++;
        }

        for(i = 0; i < n; i++)
        {
            System.out.print(nge[i] + " ");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        printNGE(arr, N);
    }
}
