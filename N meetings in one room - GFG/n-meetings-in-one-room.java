//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
     static class Pair implements Comparable<Pair>
    {
        int a1;
        int a2;
        Pair (int a1, int a2) 
        {
            this.a1 = a1;
            this.a2 = a2;
        }
        public int compareTo(Pair other) 
        {
            return this.a2 - other.a2;
        }
    }

    public static int maxMeetings(int start[], int end[], int n)
    {
        Pair[] pairs = new Pair[start.length];
        for (int i = 0; i < pairs.length; i++)
        {
            pairs[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(pairs);

        int count=1;
        int meetE=pairs[0].a2;

        for(int i=1;i<start.length;i++){
            if(pairs[i].a1>meetE){
                count++;
                meetE=pairs[i].a2;
            }
        }
        return count;
    }
}
