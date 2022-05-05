import java.util.*;
public class FindKthLargest {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        Arrays.sort(array);
        System.out.println(array[n-k]);
    }
}
