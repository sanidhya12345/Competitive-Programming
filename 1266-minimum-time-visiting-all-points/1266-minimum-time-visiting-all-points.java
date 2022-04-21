class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int minimumtime=0;
    for(int i=0;i<points.length-1;i++){
        int point0=Math.abs(points[i][0]-points[i+1][0]);
        int point1=Math.abs(points[i][1]-points[i+1][1]);
        minimumtime+=Math.max(point0,point1);
    }
    return minimumtime;
    }
}