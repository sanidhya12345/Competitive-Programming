import java.util.*;
public class Unlock {
    private static void KswapPermutation( int arr[], int n, int k)
    {
        int pos[] = new int[n + 1];

        for (int i = 0; i < n; ++i)
            pos[arr[i]] = i;

        for (int i = 0; i < n && k > 0; ++i) {
            if (arr[i] == n - i)
                continue;
            int temp = pos[n - i];
            pos[arr[i]] = pos[n - i];
            pos[n - i] = i;
            int tmp1 = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tmp1;
            --k;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        KswapPermutation(array,n,k);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}