import java.util.*;
public class Special_Matrix
{
    static Scanner sc = new Scanner(System.in);

   static  void ComputeTill(int arr[], int cur, int prev)
    {
        for(int i = prev; i <= cur; i++)
        {
            if(arr[i] == 0)
            {
                for(int j = 1; j*i < arr.length; j++)
                    arr[j*i]++;
            }

        }
    }

    public static void main(String args[] )
    {
        int arr[] = new int[2000001];
        int cur = 2;
        int t = 1;
        t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(),m = sc.nextInt();
            ComputeTill(arr, m+n, cur);
            if(m+n > cur)
                cur = m+n;
            long count = 0;

            long firstrow = 0;
            for(int i = 2; i <= m+1; i++ )
                firstrow += arr[i];
            count += firstrow;
            for(int j = 2; j <= n; j++)
            {
                firstrow = firstrow - arr[j] + arr[m+j];
                count += firstrow;
            }
            System.out.println(count);
        }
    }
}