import java.util.Scanner;

public class BubbleSortExample {
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int [] ar=new int[5];

        //step 1 input
        System.out.println("Enter the elements in array");
        for (int i = 0; i < ar.length ; i++) {
            ar[i]= sc.nextInt();
        }

        //step 2 for process
        for (int r = 0; r < ar.length-1; r++) {
            for (int c = r; c <= ar.length-1; c++) {
                if (ar[r]>ar[r+1])
                {
                    int temp=ar[r+1];
                    ar[r+1]=ar[r];
                    ar[r]=temp;
                }
            }
        }

        // step 3 output
        System.out.println("---------Bubble-Sorted--------");
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        BubbleSortExample obj=new BubbleSortExample();
        obj.func();
    }
}
