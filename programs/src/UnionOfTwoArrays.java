import java.util.ArrayList;

public class UnionOfTwoArrays {
    private static ArrayList<Integer> union(int  [] arr1,int [] arr2){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int j : arr1) {
            arrayList.add(j);
        }
        for (int k : arr2) {
            int count = 0;
            for (int i : arr1) {
                if (k == i) {
                    count += 1;
                }
            }
            if (count < 1) {
                arrayList.add(k);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        int [] arr2={1,2,3,4,7,8,9,17};
        System.out.println(union(arr1,arr2));
    }
}
