import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            int val=sc.nextInt();
            map.put(val,true);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                System.out.println(i);
                break;
            }
        }

    }
}
