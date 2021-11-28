package CodingBlocks.src;

import java.util.Scanner;

public class Mazepath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int result=printMaze(row,col,"",0,0);
        System.out.println();
        System.out.println(result);
    }
    public static int  printMaze(int er,int ec,String ans,int cr,int cc){
        if(er-1==cr && cc==ec-1 ){
            System.out.print(ans+" ");
            return 1;
        }
        if (cr>=er || cc>=ec){
            return 0;
        }
        int count=0;
        count+=printMaze(er,ec,ans+"V",cr+1,cc);
        count+=printMaze(er,ec,ans+"H",cr,cc+1);
        return count;
    }
}
