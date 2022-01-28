package CodingBlocks.src;

import java.util.*;

public class Importance_of_Time {
    static void solve(Queue<Integer> lstGiven, List<Integer> lstIdeal){
        int count = 0;
        int index = 0;
        while(index < lstIdeal.size()){
            if(lstIdeal.get(index) == lstGiven.peek()){
                index++;
                lstGiven.poll();
                count++;
            }else{
                count++;
                int element = lstGiven.poll();
                lstGiven.add(element);
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int [n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        List<Integer> lstIdeal = new ArrayList<>(n);
        Queue<Integer> lstGiven = new LinkedList<>();
        for(int i:arr1){
            lstGiven.add(i);
        }
        for(int i:arr2){
            lstIdeal.add(i);
        }
        solve(lstGiven,lstIdeal);
    }

}
