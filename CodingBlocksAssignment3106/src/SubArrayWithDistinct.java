import java.util.*;
public class SubArrayWithDistinct {
    private static int sumoflength(int[] arr, int n)
    {
        Set<Integer> s = new HashSet<>();
        int j = 0, ans = 0;
        for (int i = 0; i < n; i++)
        {
            while (j < n && !s.contains(arr[j]))
            {
                s.add(arr[j]);
                j++;
            }

            ans += ((j - i) * (j - i + 1)) / 2;
            s.remove(arr[i]);
        }

        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int ans=sumoflength(array,n);
        System.out.println(ans%1000000007);
    }
}