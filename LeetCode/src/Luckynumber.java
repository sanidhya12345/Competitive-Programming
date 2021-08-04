import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Luckynumber {
    public ArrayList<Integer> max_of_column(int [][] array){
        ArrayList<Integer> max_column= new ArrayList<>();
        int max=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (array[j][i]>max){
                    max=array[j][i];
                }
            }
            max_column.add(max);
        }
        return max_column;
    }
    public ArrayList<Integer> min_of_rows(int [][] array){
        ArrayList<Integer> min_row= new ArrayList<>();
        int min=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                if (array[i][j]<array[i][j+1]){
                    min=array[i][j];
                    array[i][j]=array[i][j+1];
                    array[i][j+1]=min;
                }
            }
            min_row.add(min);
        }
        return min_row;
    }
    public ArrayList<Integer> commonOfTwo(ArrayList<Integer> m,ArrayList<Integer> n){
        m.retainAll(n);
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] ar=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                ar[i][j]= sc.nextInt();
            }
        }
        Luckynumber obj=new Luckynumber();
        System.out.println(obj.commonOfTwo(obj.max_of_column(ar),obj.min_of_rows(ar)));

    }
}
