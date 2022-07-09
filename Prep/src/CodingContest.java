import java.util.Scanner;

public class CodingContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String ans="";
            for(int i=0;i<Math.min(a,b);i++){
                ans+="01";
            }
            for(int j=0;j<Math.abs(a-b);j++){
                if(a<b){
                    ans+="1";
                }
                else{
                    ans+="0";
                }
            }
            System.out.println(ans);
        }
    }
}
