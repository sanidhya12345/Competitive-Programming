import java.util.Scanner;

public class Keypad {
    private static final String[] KEYS = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx","yz" };
    private static int combination(String prefix, String digits, int offset) {
        if (offset >= digits.length()) {
            System.out.print(prefix+" ");
            return 1;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        int count=0;
        for (int i = 0; i < letters.length(); i++) {
            count+=combination(prefix + letters.charAt(i), digits, offset + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digits=sc.next();
        int result=combination("",digits,0);
        System.out.println();
        System.out.println(result);
    }
}
