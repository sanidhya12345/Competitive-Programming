import java.util.ArrayList;
import java.util.Scanner;

public class Codeforces {
    static Scanner sc=new Scanner(System.in);
    private static void solution(){
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        int testcases=sc.nextInt();
        for(int i=1;i<=testcases;i++){
            solution();
        }
    }
}
