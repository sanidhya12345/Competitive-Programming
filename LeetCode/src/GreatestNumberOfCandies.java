import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList=new ArrayList<>();
        int [] candies_dupli=new int[candies.length];
        for (int i = 0; i <candies.length ; i++) {
            candies_dupli[i]=candies[i];
        }
        Arrays.sort(candies);
        int maxcandies=candies[candies.length-1];
        for (int i = 0; i <candies.length ; i++) {
            candies_dupli[i]+=extraCandies;
            if (candies_dupli[i]>=maxcandies)
                booleanList.add(true);
            else
                booleanList.add(false);
        }
        return booleanList;
    }
    public static void main(String[] args) {
        GreatestNumberOfCandies obj=new GreatestNumberOfCandies();
        int [] cdies={2,3,5,1,3};
        List<Boolean> list=obj.kidsWithCandies(cdies,3);
        System.out.println(list);
    }
}
