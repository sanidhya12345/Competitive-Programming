import java.util.Scanner;

public class Cfa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            long n=sc.nextLong();
            if(n%2==0){
                System.out.println(n/2+" "+0+" "+n/2);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
