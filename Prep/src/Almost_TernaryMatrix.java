package Prep.src;
import java.util.Scanner;

public class Almost_TernaryMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            for(long i=1;i<=n;i++){
                for(long j=1;j<=m;j++){
                    System.out.print(((i/2+j/2)&1)+" ");
                }
                System.out.println();
            }
        }
    }
}
