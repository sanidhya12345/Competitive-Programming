import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeDivisors {
    public static boolean isThree(int n) {
        List<Integer> divisors=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                divisors.add(i);
            }
        }
        return divisors.size() == 3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isThree(n));
    }
}
