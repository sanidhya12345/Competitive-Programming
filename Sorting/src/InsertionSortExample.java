import java.util.Scanner;

public class InsertionSortExample {
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int [] ar=new int[5];

        //Step 1 for input
        System.out.println("Enter array elements......");
        for(int i=0;i< ar.length;i++)
        {
            ar[i]= sc.nextInt();
        }

        //Step 2 for process.
        for (int r=1;r<5;r++)//pass
        {
            for (int c=0;c<r;c++)//comp
            {
                if (ar[c]>ar[r])//swapping
                {
                    int temp=ar[c];
                    ar[c]=ar[r];
                    ar[r]=temp;
                }
            }
        }

        //Step 3 for output.
        System.out.println("--------Sorted---------");
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        InsertionSortExample obj=new InsertionSortExample();
        obj.func();
    }
}
