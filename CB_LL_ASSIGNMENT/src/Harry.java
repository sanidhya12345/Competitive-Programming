/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Arrays;
import java.util.Scanner;

public class Harry {
    static int count=0;
    static int harry(int n, int prev)
    {
        if (n == 0)
            return 0;
        prev = n;

        int[] digits=new int[4];
        for (int i=0; i<4; i++)
        {
            digits[i] = n%10;
            n = n/10;
        }
        Arrays.sort(digits);
        int asc = 0;
        for (int i=0; i<4; i++)
            asc = asc*10 + digits[i];
        Arrays.sort(digits);
        int desc = 0;
        for (int i=3; i>=0; i--)
            desc = desc*10 + digits[i];


        int diff = Math.abs(asc - desc);


        if (diff == prev)

            return diff;
        count++;
        return harry(diff, prev);
    }


    static int dup(int n)
    {
        int prev = 0;
        return harry(n, prev);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sp=6174;
        if(sp==dup(n)){
            System.out.println(count);
        }
    }
}

