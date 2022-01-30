import java.io.*;
import java.util.*;

public class Count_The_Submatrices{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] inp = br.readLine().split(" ");
        int M = Integer.parseInt(inp[0]);
        int N = Integer.parseInt(inp[1]);
        int P = Integer.parseInt(inp[2]);
        int[][] A = new int[M][N];
        for(int i=0;i<M;i++)
        {
            String[] inp1 = br.readLine().split(" ");
            for(int j=0;j<N;j++)
            {
                A[i][j] = Integer.parseInt(inp1[j]);
            }
        }
        int out_ = solve(M, N, P, A);
        System.out.println(out_);
        wr.close();
        br.close();
    }
    static int solve(int M, int N, int P, int[][] A) {

        int temp[]=new int[M];
        int count=0;
        for(int left=0;left<N;left++){
            Arrays.fill(temp,0);
            for(int right=left;right<N;right++){
                for(int i=0;i<M;i++){
                    temp[i]=temp[i]+A[i][right];
                }
                count=count+countSubArray(temp,M,P);
            }
        }

        return count;

    }
    static int countSubArray(int[] temp,int M,int P){
        int cumSum[]=new int[P];
        int sum=0,result=0;
        Arrays.fill(cumSum,0);
        for(int i=0;i<M;i++){
            sum=sum+temp[i];
            cumSum[((sum%P)+P)%P]++;

        }
        for(int j=0;j<P;j++){
            if(cumSum[j]>1){
                result+=(cumSum[j]*(cumSum[j]-1))/2;
            }
        }
        result+=cumSum[0];
        return result;
    }
}