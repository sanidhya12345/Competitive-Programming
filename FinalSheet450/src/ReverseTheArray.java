import java.util.Scanner;

public class ReverseTheArray {
    public static void print(int [] array){
        for (int i = array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[5];
        for (int i = 0; i <5; i++) {
            array[i]= sc.nextInt();
        }
        print(array);
    }
}
