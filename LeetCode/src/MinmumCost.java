package LeetCode.src;

import java.util.Arrays;

public class MinmumCost {
    public static int minimumCost(int[] cost) {
        int minimumcost=0;
        for (int i = 0; i <cost.length ; i++) {
            if(i%3!=cost.length%3){
                minimumcost+=cost[i];
            }
        }
        return minimumcost;
    }
    public static void main(String[] args) {
           int [] cost={6,5,7,9,2,2};
           Arrays.sort(cost);
        System.out.println(minimumCost(cost));
    }
}
