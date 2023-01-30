//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    
    public static boolean isPalin(int num){
        String s=Integer.toString(num);
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
	public static int palinArray(int[] a, int n)
           {
                  int count=0;
                  for(Integer i:a){
                      if(isPalin(i)){
                          count++;
                      }
                  }
                 if(count==n){
                     return 1;
                 }
                 return 0;
           }
}