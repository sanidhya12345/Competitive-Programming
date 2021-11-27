import java.util.Scanner;

public class ReplacePi {
    public static String replacePi(String s)
    {
        if (s.length() == 0 || s.length() == 1)
            return s;
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {

            String smallOutput = replacePi(s.substring(2));
            return "3.14" + smallOutput;
        }
        else {

            String smallOutput = replacePi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=0){
            String s = sc.next();
            String result = replacePi(s);
            System.out.println(result);
            n-=1;
        }
    }
}
