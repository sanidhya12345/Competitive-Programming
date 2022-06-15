import java.util.Scanner;

public class SplitBinaryString {
    private static int splitString(String s,int n){
        int count0=0;
        int count1=0;
        int finalcount=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else{
                count1++;
            }
            if(count0==count1){
                finalcount++;
            }
        }
        return finalcount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        System.out.println(splitString(s,n));
    }
}
