class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<rectangles.length;i++){
                int li=rectangles[i][0];
                int wi=rectangles[i][1];
                list.add(Math.min(li,wi));
        }
        int max=Collections.max(list);
        int count=0;
        for(int i:list){
            if(i==max){
                count++;
            }
        }
        return count;
    }
}