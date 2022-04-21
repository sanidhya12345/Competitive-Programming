import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Findthedifferenceoftwoarrays {
    static ArrayList<ArrayList<Integer>> answerlist=new ArrayList<>();
    private static ArrayList<Integer> first_to_second(int [] arr1,int [] arr2){
        Set<Integer> set1=new HashSet<>();
        int count=0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (k != i) {
                    count++;
                }
            }
            if (count == arr2.length) {
                set1.add(k);
            }
            count=0;
        }
        return new ArrayList<>(set1);
    }
    private static ArrayList<Integer> second_to_first(int [] arr1,int [] arr2){
        Set<Integer> set2=new HashSet<>();
        int count=0;
        for (int k : arr2) {
            for (int i : arr1) {
                if (k != i) {
                    count++;
                }
            }
            if (count == arr2.length) {
                set2.add(k);
            }
            count=0;
        }
        return new ArrayList<>(set2);
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,3};
        int [] arr2={1,1,2,2};
        ArrayList<Integer> list1=first_to_second(arr1,arr2);
        ArrayList<Integer> list2=second_to_first(arr1,arr2);
        answerlist.add(list1);
        answerlist.add(list2);
        System.out.println(answerlist);
    }
}
