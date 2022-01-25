package LeetCode.src;

public class Count_hidden_sequence {
    public static int numberOfArrays(int[] diff, int lower, int upper) {
        long a = 0, max = 0, min = 0;
        for (int d: diff) {
            a += d;
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        return (int)Math.max(0, (upper - lower) - (max - min) + 1);
    }

    public static void main(String[] args) {
        int [] diff={1,-3,4};
        int lower=1;
        int upper=6;
        System.out.println(numberOfArrays(diff,lower,upper));
    }
}
