class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min=salary[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max=salary[i];
            }
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=min && salary[i]!=max){
                sum+=salary[i];
            }
        }
        return (sum/(salary.length-2));
    }
}