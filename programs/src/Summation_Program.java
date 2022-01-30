import java.util.Scanner;

public class Summation_Program {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int x=1;x<=T;x++){
            long n,ans=0,p,i;
            n = s.nextLong();
            p=(long)Math.sqrt(n);
            for(i =1;i<=p;i++){
                ans +=2*(n/i);
            }
            System.out.println(ans-p*p);
        }
    }
}
