import java.util.Scanner;

public class XORoperation {
    public static int xorOperation(int n, int start) {
        int [] nums=new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i]=start+2*i;
        }
        int operation=0;
        for (int i:nums) {
            operation^=i;
        }
        return operation;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int start= sc.nextInt();
        int ans=xorOperation(n,start);
        System.out.println(ans);
    }
}
