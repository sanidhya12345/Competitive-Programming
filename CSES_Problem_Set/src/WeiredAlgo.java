import java.util.Scanner;

public class WeiredAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while(n!=1) {
            if (n % 2 == 0) {
                System.out.print(n+" ");
                n = n / 2;
            }
            else if(n%2!=0){
                System.out.print(n+" ");
                n = 3 * n + 1;
            }
        }
        System.out.print(1);
    }
}
