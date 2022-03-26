import java.util.Arrays;

public class MoveAllNegativeToOneSide {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,-2,-4,-5,6,-6,8,9,10};
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
