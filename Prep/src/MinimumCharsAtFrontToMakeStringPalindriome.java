import java.util.Scanner;

public class MinimumCharsAtFrontToMakeStringPalindriome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=0;
        int end=s.length()-1;
        int res=0;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                res++;
                start=0;
                end=s.length()-res-1;
            }
        }
        System.out.println(res);
    }
}
