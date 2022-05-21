import java.util.ArrayList;
import java.util.Scanner;

public class Juspayconvergngcells {
    public static boolean binarysearch(ArrayList<Integer> list,int target){
        int low=0;
        int high=list.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(list.get(mid)==target){
                return true;
            }
            else if(list.get(mid)<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static int solution(int [] array,int src,int dest){
        int startcell=src;
        ArrayList<Integer> c1_cells=new ArrayList<>();
        int cell=startcell;
        while(cell>-1 && !binarysearch(c1_cells,cell)){
            c1_cells.add(cell);
            cell=array[cell];
        }
        startcell=dest;
        ArrayList<Integer> c2_cells=new ArrayList<>();
        cell=startcell;
        while(cell>-1 && !binarysearch(c2_cells,cell)){
            c2_cells.add(cell);
            cell=array[cell];
        }

        int min_distance=Integer.MAX_VALUE;
        int ans=-1;

        for(int j:c1_cells) {
            if (binarysearch(c1_cells, j)) {
                int dst = Math.max(c1_cells.indexOf(j), c2_cells.indexOf(j));
                if (min_distance > dst) {
                    min_distance = dst;
                    ans = j;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==ans){
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test--!=0){
            int src,dest;
            int numofblocks= sc.nextInt();
            int array[]=new int[numofblocks];
            for(int i=0;i<numofblocks;i++){
                array[i]=sc.nextInt();
            }
            src= sc.nextInt();
            dest= sc.nextInt();
            System.out.println(solution(array,src,dest));
        }
    }
}
