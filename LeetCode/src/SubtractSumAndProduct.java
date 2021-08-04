import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtractSumAndProduct {
    public static int subtractProductAndSum(int n) {
        List<Integer> digits=new ArrayList<>();
        while(n!=0){
            int m=n%10;
            digits.add(m);
            n=n/10;
        }
        int sum=0;
        int mul=1;
        for (int i:digits) {
            sum+=i;
            mul*=i;
        }
        return mul-sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=subtractProductAndSum(n);
        System.out.println(ans);
    }
}
