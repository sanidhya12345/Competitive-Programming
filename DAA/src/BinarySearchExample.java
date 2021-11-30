package DAA.src;

import java.util.Scanner;

public class BinarySearchExample {
    public static  void binarySearch(int [] array,int data){
        int lower_idx=0;
        int upper_idx=array.length-1;
        int mid;
        int count=0;
        while(lower_idx<=upper_idx){
            mid=lower_idx+upper_idx/2;
            if (array[mid]==data){
                count++;
                break;
            }
            else if(data<array[mid]){
                lower_idx=lower_idx+1;
            }
            else if (data>array[mid]){
                upper_idx=upper_idx-1;
            }
        }
        if (count>0){
            System.out.println("found....");
        }
        else{
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array={4,5,6,1,3,4,9,5};
        System.out.println("Enter the element you want to find:-");
        int data= sc.nextInt();
        binarySearch(array,data);
    }
}
