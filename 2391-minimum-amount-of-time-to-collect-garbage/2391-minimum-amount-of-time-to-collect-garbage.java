class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int mtime = 0;
        int gtime = 0;
        int ptime = 0;
        int minimumtime = 0;
        int start = 0;
        for (int i = 0; i < garbage.length; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if (garbage[i].charAt(j) == 'M') {
                    minimumtime += mtime;
                    mtime = 0;
                } else if (garbage[i].charAt(j) == 'P') {
                    minimumtime += ptime;
                    ptime = 0;
                } else {
                    minimumtime += gtime;
                    gtime = 0;
                }
                minimumtime++;
            }
            if(start<travel.length){
                mtime+=travel[start];
                ptime+=travel[start];
                gtime+=travel[start++];
            }
        }
        return minimumtime;
    }
}