//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
static int maxDeadline(int deadline[],int n){
    int max=deadline[0];
    for(int i=1;i<n;i++){
        if(max<deadline[i]){
            max=deadline[i];
        }
    }
    return max;
}
static int [] maxProfit(int profit[],int deadline[],int n){
    int ans[]=new int[2];
    int maxsize=maxDeadline(deadline,n);
    int [] job_vector=new int[maxsize+1];
    for(int i=0;i<=maxsize;i++){
        job_vector[i]=0;
    }
    for(int i=n-1;i>=0;i--){
        int line=deadline[i];
        if(job_vector[line]==0){
            job_vector[line]=profit[i];
        }
        else {
            for(int j=line;j>0;j--){
                if(job_vector[j]==0){
                    job_vector[j]=profit[i];
                    break;
                }
            }
        }
    }
    int maxprofit=0;
    int count=0;
    for(int i=1;i<=maxsize;i++){
        if(job_vector[i]!=0){
             maxprofit+=job_vector[i];
             count++;
        }
    }
    ans[0]=count;
    ans[1]=maxprofit;
    return ans;
}
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, new Comparator<Job>() {

        @Override
      public int compare(Job o1, Job o2) {
        return Integer.compare(o1.profit, o2.profit);
    }});
        int [] profit=new int[n];
        int [] deadline=new int[n];
        for(int i=0;i<n;i++){
            profit[i]=arr[i].profit;
            deadline[i]=arr[i].deadline;
        }
        int [] result=maxProfit(profit,deadline,n);
        return result;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/