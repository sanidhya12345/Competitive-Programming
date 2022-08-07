class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c=0;
        int r=0;
        int o=0;
        int a =0;
        int k=0;
        int ans=-1;
        int active=0;
        for(char ch:croakOfFrogs.toCharArray()){
            if(ch=='c'){
                active++;
                c++;
            }
            if(ch=='r'){
                r++;
            }
            if(ch=='o'){
                o++;
            }
            if(ch=='a'){
                a++;
            }
            if(ch=='k'){
                k++;
                active--;
            }
            if(c<r || r<o || o<a || a<k){
                return -1;
            }
            ans=Math.max(ans,active);
        }
        return active==0?ans:-1;
    }
}