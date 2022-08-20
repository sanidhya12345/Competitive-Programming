class Solution {
    public int countAsterisks(String s) {
        String [] temp = s.split("\\|");
        int count=0;
        for(int i=0; i<temp.length; i+=2){
            for(int j=0; j<temp[i].length(); ++j){
                if(temp[i].charAt(j) == '*')
                    count++;
            }
        }
        return count;
    }
}