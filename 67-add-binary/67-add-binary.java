class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        int s=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 || s==1){
            s+=((i>=0)?a.charAt(i)-'0':0);
            s+=((j>=0) ? b.charAt(j)-'0':0);
            result.append((char)(s % 2 + '0'));
            s /= 2;
            i--; j--;
        }
        int start=result.length()-1;
        while(start>=0 && result.charAt(start)=='0'){
            start--;
        }
        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }
        return result.length()==0?"0":result.reverse().toString();
    }
}