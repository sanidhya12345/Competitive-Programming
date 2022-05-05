import java.util.*;
public class HighestFrequency {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int max=Collections.max(map.values());
        for(int i:map.keySet()){
            if(map.get(i)==max){
                System.out.println(i);
            }
        }
    }
}
