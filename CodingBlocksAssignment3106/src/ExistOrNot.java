import java.util.*;
public class ExistOrNot {
    private static boolean check(int[] arr, int toCheckValue)
    {
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, toCheckValue);
        boolean test = res > 0 ? true : false;
        return test;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase--!=0){
            int size=sc.nextInt();
            int [] array=new int[size];
            for(int i=0;i<size;i++){
                array[i]=sc.nextInt();
            }
            int query=sc.nextInt();

            while(query--!=0){
                int n=sc.nextInt();
                if(check(array,n)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

        }
    }
}