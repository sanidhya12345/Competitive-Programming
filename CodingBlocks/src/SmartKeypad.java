import java.util.Scanner;

public class SmartKeypad {
    private static final String[] KEYS = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    private static void combination(String prefix, String digits, int offset) {
        if (offset >= digits.length()) {
            System.out.println(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offset + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digits=sc.next();
        combination("",digits,0);

    }
}
