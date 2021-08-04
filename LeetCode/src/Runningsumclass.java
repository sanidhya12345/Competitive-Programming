import java.util.Arrays;

public class Runningsumclass {
    public int[] runningsum(int [] nums){
        int sum=0;
        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        Runningsumclass rsc=new Runningsumclass();
        int [] r={1,2,3,4};
        System.out.println(Arrays.toString(rsc.runningsum(r)));
    }
}
