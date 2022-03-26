import java.util.ArrayList;

public class IntersectionOftwoArrays {
    private static ArrayList<Integer> intersect(int [] arr1,int [] arr2){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int k : arr2) {
            int count = 0;
            for (int i : arr1) {
                if (k == i) {
                    count += 1;
                }
            }
            if (count==1) {
                arrayList.add(k);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        int [] arr2={7,8,9,17,1,2};
        System.out.println(intersect(arr1,arr2));
    }
}
