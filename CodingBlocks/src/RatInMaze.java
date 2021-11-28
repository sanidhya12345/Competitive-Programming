package CodingBlocks.src;

import java.util.Scanner;

public class RatInMaze {
    public static boolean ratMaze(char [][] maze,int [][] soln,int i,int j,int n,int m){
        if(i>n || j>m || i<0 || j<0 || soln[i][j]<0){
            return false;
        }
        if(maze[i][j]=='X'){
            return false;
        }

        if(i==n&&j==m){
            soln[n][m]=1;

            for(i=0;i<=n;i++){
                for(j=0;j<=m;j++){
                    System.out.print(soln[i][j]+" ");
                }
                System.out.println();
            }

            return true;
        }
        boolean right=false;
        boolean down=false;
        boolean up=false;
        boolean left=false;
        soln[i][j] = 1;
        if(i+1<=n && soln[i+1][j]==0){
            down = ratMaze(maze,soln,i+1,j,n,m);
        }
        //Modiificatons:
        if(j+1<=m && soln[i][j+1]==0 && !down){
            right = ratMaze(maze,soln,i,j+1,n,m);
        }
        if(i-1>=0 && soln[i-1][j]==0 && !down && !right){
            up = ratMaze(maze,soln,i-1,j,n,m);
        }
        if(j-1>=0 && soln[i][j-1]==0 && !down && !right && !up){
            left = ratMaze(maze,soln,i,j-1,n,m);
        }
        if(right||down||left||up){
            return true;
        }
        //Modification:
        soln[i][j] = 0;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        char [][] maze=new char[10][10];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                maze[i][j]=s.charAt(j);
            }
        }
        int [][] soln=new int[10][10];
        boolean ans=ratMaze(maze,soln,0,0,n-1,m-1);
        if(!ans){
            System.out.println("NO PATH FOUND");
        }
    }
}
