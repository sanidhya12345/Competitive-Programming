import java.util.Scanner;

public class Monk_and_inversions {
    public static int inversions(int [][]matrix,int size){
        int ans=0;
        int temp=0;
        for(int j=0; j<size; j++){
            for(int k=0; k<size; k++){
                temp= matrix[j][k];
                int m=j;
                int n=k;
                for(int x=0; x<size; x++){
                    for(int y=0; y<size; y++){
                        if(m<=x && n<=y){
                            if(temp > matrix[x][y]){
                                ans+=1;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test!=0){
            int n=sc.nextInt();
            int [][] matrix=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            System.out.println(inversions(matrix,n));
            test-=1;
        }
    }
}
