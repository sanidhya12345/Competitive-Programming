package CodingBlocks.src;

import java.util.Scanner;

public class Count_Number_Of_Binary_STrings {
    public static long cs(long n){
        if(n<1)return 0;
        long C0=1;
        long C1=1;
        for(int i=1;i<n;i++){
            long t=C1;
            C1=C0;
            C0=C0+t;
        }
        return C0+C1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            long n=sc.nextLong();
            System.out.println(cs(n));
            t=t-1;
        }
    }
}
