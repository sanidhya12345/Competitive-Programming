package CodingBlocks.src;

import java.util.Scanner;

public class MazePath_D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int result=printMazeDiagonal(row,row,"",0,0);
        System.out.println();
        System.out.println(result);
    }
    public static int  printMazeDiagonal(int er,int ec,String ans,int cr,int cc){
        if(er-1==cr && cc==ec-1 ){
            System.out.print(ans+" ");
            return 1;
        }
        if (cr>=er || cc>=ec){
            return 0;
        }
        int count=0;
        count+=printMazeDiagonal(er,ec,ans+"V",cr+1,cc);
        count+=printMazeDiagonal(er,ec,ans+"H",cr,cc+1);
        if(cr==cc || cr+cc==er-1){
            count+=printMazeDiagonal(er,ec,ans+"D",cr+1,cc+1);
        }
        return count;
    }
}
