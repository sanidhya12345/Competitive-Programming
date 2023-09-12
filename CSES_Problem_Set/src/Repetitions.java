import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char cur=' ';
        int count=0;
        int answer=0;
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=cur){
                cur=s.charAt(i);
                count=0;
            }
            if(s.charAt(i)==cur){
                count++;
            }
            answer=Math.max(answer,count);
        }
        System.out.println(answer);
    }
}
