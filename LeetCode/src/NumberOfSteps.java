import java.util.Scanner;

public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if (num%2==0){
                num=num/2;
            }
            else{
                num-=1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int ans=numberOfSteps(num);
        System.out.println(ans);
    }
}
