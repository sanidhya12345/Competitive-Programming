import java.util.*;
public class MergeKsortedArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] array=new int[n*k];
        for(int i=0;i<n*k;i++)
            array[i]=sc.nextInt();
        Arrays.sort(array);
        for(int i=0;i<n*k;i++)
            System.out.print(array[i]+" ");
    }
}
