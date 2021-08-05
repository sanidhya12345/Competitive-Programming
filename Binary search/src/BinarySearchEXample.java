//difference between linear search and binary search.
//what is a linear search?
//what is a binary search?
//wap of linear search by using array and by using linked list.
//wap of the binary search through array.
//what do you mean by lower bound,upper bound.HOw to find the middle element in binary search?

import java.util.Scanner;

public class BinarySearchEXample
{
    void func()
    {
        Scanner sc=new Scanner(System.in);
        int [] ar=new int[10];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < ar.length; i++) {
            ar[i]= sc.nextInt();
        }
        System.out.println("Enter the seaching element");
        int sea= sc.nextInt();

        int lb=0;
        int ub= ar.length-1;
        int mid;
        int count=0;

        while (lb<=ub)
        {
            mid=(lb+ub)/2;
            if (sea==ar[mid]){
                count++;
                break;
            }
            else if (sea<ar[mid]){
                ub=mid-1;
            }
            else if (sea>ar[mid]){
                lb=mid+1;
            }
        }
        if (count>0)
        {
            System.out.println("found...");
        }
        else
        {
            System.out.println("not found...");
        }

    }
    public static void main(String[] args)
    {
        BinarySearchEXample obj=new BinarySearchEXample();
        obj.func();
    }
}
