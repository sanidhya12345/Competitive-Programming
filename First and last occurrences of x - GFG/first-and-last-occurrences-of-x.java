// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class GFG
{
    static long first(long arr[],
                 int x, int n)
{
  int low = 0, high = n - 1;
      long res = -1;
  while (low <= high)
  {
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
    else
    {
      res = mid;
      high = mid - 1;
    }
  }
  return res;
}

static long last(long arr[], int x, int n)
{
  int low = 0, high = n - 1;
      long res = -1;
  while (low <= high)
  {
   
    int mid = (low + high) / 2;
    if (arr[mid] > x)
      high = mid - 1;
    else if (arr[mid] < x)
      low = mid + 1;
    else
    {
      res = mid;
      low = mid + 1;
    }
  }
  return res;
}
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> al=new ArrayList<>();
        long firstoccur=first(arr,x,n);
        long lastoccur=last(arr,x,n);
        al.add(firstoccur);
        al.add(lastoccur);
        return al;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends