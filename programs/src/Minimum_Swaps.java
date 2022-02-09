import java.util.Scanner;
public class Minimum_Swaps {
    static int findMinSwaps(int arr[], int n)
    {
        int numberOfA = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 65)
                numberOfA++;
        }
        int x = numberOfA;

        int count_A = 0, maxA;

        for(int i = 0; i < x; i++){
            if(arr[i] == 65)
                count_A++;
        }

        maxA = count_A;
        for (int i = 1; i <= n-x; i++) {
            if (arr[i - 1] == 65)
                count_A--;
            if(arr[i + x - 1] == 65)
                count_A++;

            if (maxA< count_A)
                maxA = count_A;
        }
        int numberOfB = x - maxA;

        return numberOfB;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String [] ar=inp.split(",");
        int arr[]=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            arr[i]=(int)ar[i].charAt(0);
        }
        if(findMinSwaps(arr,arr.length)==0){
            System.out.println(-1);
        }
        else{
            System.out.println(findMinSwaps(arr,arr.length));
        }
    }
}
