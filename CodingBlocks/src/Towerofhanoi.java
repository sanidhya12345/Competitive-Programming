package CodingBlocks.src;

import java.util.Scanner;

public class Towerofhanoi {
    static int towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move 1th disc from "+
                    from_rod+" to "+to_rod);
            return 1;
        }
        int count=1;
        count+=towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move "+ n +"th disc "+ "from " +
                from_rod +" to " + to_rod );
        count+=towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result=towerOfHanoi(n,"T1","T2","T3");
        System.out.println(result);
    }
}
