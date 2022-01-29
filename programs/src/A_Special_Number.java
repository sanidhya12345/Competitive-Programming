import java.util.Scanner;

public class A_Special_Number {
    public static boolean findsumofdigits(int n){
        int sum=0;
        while(n!=0){
            int m=n%10;
            sum+=m;
            n=n/10;
        }
        if(sum%4==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0){
            int n= sc.nextInt();
            while (!findsumofdigits(n)){
               n=n+1;
            }
            System.out.println(n);
            test-=1;
        }
    }
}
