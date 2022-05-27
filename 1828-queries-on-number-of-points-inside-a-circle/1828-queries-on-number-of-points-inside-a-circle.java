class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int [] answer=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2]*queries[i][2];
            
            for(int [] point:points){
                int calc=(int)(Math.pow(point[0]-x,2)+Math.pow(point[1]-y,2));
                if(calc<=r){
                    answer[i]+=1;
                }
                else{
                    answer[i]+=0;
                }
            }
        }
        return answer;
    }
}