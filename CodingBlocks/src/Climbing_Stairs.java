package CodingBlocks.src;

import java.util.Arrays;
import java.util.Scanner;

public class Climbing_Stairs {
    private static int sol(int curr, int n, int[] cache) {


        if(curr == n) {
            return 1;
        }
        if(curr > n) {
            return 0;
        }
        if(cache[curr] != -1) {
            return cache[curr];
        }
        int c1 = sol(curr + 1, n, cache);
        int c2 = sol(curr + 2, n, cache);

        return cache[curr] = c1 + c2;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        System.out.println(sol(0, n, cache));

    }
}
