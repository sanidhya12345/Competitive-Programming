import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class SelfDividingNUmbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> dividingNumbers=new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            int value=i;
            while(i!=0){
                int m=i%10;
                if (m!=0 && value%m==0 && value%10!=0){
                    dividingNumbers.add(i);
                }
                i=i/10;
            }
        }
        return dividingNumbers;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left= sc.nextInt();
        int right= sc.nextInt();
        List<Integer> ans=selfDividingNumbers(left,right);
        System.out.println(ans);
    }
}
