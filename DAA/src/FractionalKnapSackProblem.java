import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSackProblem {
    private static double maxknapsackvalue(int[] w,int[] p,int W){
        Itemval[] x=new Itemval[p.length];
        for (int i = 0; i < w.length ; i++) {
            x[i]=new Itemval(w[i],p[i],i);
        }
        Arrays.sort(x, new Comparator<Itemval>() {
            @Override
            public int compare(Itemval o1, Itemval o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalvalue=0d;
        for (Itemval i:x) {
            int curWt = (int)i.weight;
            int curVal = (int)i.profit;

            if(W-curWt>=0){
                W=W-curWt;
                totalvalue+=curVal;
            }
            else{
                double fraction= ((double)W / (double)curWt);
                totalvalue += (curVal * fraction);
                W = (int)(W - (curWt * fraction));
                break;
            }
        }
        return totalvalue;

    }
    static class Itemval{
        Double cost;
        double weight;
        double profit;
        double ind;
        public Itemval(int weight,int profit,int ind){
            this.weight=weight;
            this.profit=profit;
            this.ind=ind;
            cost= (double) profit / (double) weight;
        }

    }
    public static void main(String[] args) {
        int [] profit={10,5,15,20};
        int [] weight={20,2,1,5};
        int capacity=20;
        double maxvalue=maxknapsackvalue(weight,profit,capacity);
        System.out.println("Maximum Value:- "+maxvalue);
    }
}
