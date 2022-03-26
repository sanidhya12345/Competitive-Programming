// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}// } Driver Code Ends


class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
       int t_len = n + m;
        
        int gap = (t_len+1)/2;
        
        while(gap>0)
        {
            int i = 0;
            int j = gap;
            int a1[], a2[];
            while(j<t_len)
            {
                
                int sub1, sub2;
                if(i<n)
                {
                    a1 = arr1;
                    sub1 = 0;
                }
                else
                {
                    a1 = arr2;
                    sub1 = n;
                }
                
                if(j<n)
                {
                    a2 = arr1;
                    sub2 = 0;
                }
                else
                {
                    a2 = arr2;
                    sub2 = n;
                }
                
                if(a1[i-sub1]>a2[j-sub2])
                {
                    int temp = a1[i-sub1];
                    a1[i-sub1] = a2[j-sub2];
                    a2[j-sub2] = temp;
                }
                
                i++;
                j++;
                
            }
            
            if(gap!= 1) gap = (gap + 1)/2;
            else gap = 0;
            
        }
        
    }
}