import java.util.*;
public class MergeKsortedList {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n*k];
        for(int i=0;i<n*k;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n*k;i++)
            System.out.print(arr[i]+" ");
    }
}
