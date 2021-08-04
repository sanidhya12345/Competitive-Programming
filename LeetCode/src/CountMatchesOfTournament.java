
import java.util.Scanner;

public class CountMatchesOfTournament {
    public static int numberOfMatches(int n) {
        int count=0;
        while(n!=1){
            if(n%2==0)
            {
                count+=n/2;
                n= n/2;

            }
            else{
                count+=(n-1)/2;
                n=((n-1)/2)+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int ans=numberOfMatches(number);
        System.out.println(ans);
    }
}
