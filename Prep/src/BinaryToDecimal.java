package Prep.src;

import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int startValue=0;
        String s1=s.substring(0, 2);
        if(s1.equals("01")){
            startValue=1;
        }
        else if(s1.equals("10")){
            startValue=2;
        }
        else if(s1.equals("11")){
            startValue=3;
        }
        for(int i=2;i<s.length();i++){
            char chr=s.charAt(i);
            if(chr=='1'){
                startValue=startValue*2+1;
            }
            else if(chr=='0'){
                startValue=startValue*2;
            }
            else{
                System.out.println("Not Possible");
                startValue=0;
                break;
            }
        }
        System.out.println(startValue);
        sc.close();
    }
}