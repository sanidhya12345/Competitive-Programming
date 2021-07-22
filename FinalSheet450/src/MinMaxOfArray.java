import java.util.Scanner;

/*case1:
input:- 5 4 2 1 9
output:- max=9,min=1
*/

public class MinMaxOfArray {
    public static int maximum(int [] array){
        int max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    public static int minimum(int [] array){
        int min=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[5];
        for (int i = 0; i <5 ; i++) {
            array[i]= sc.nextInt();
        }
        int maximum=maximum(array);
        int minimum=minimum(array);
        System.out.println("Maximum of Array "+maximum);
        System.out.println("Minimum of Array "+minimum);
    }
}
