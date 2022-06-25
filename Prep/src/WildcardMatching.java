public class WildcardMatching {
    public static boolean isMatch(String s,String p){
        int i=0;
        int j=0;
        int startIndex=-1;
        int iIndex=-1;
        while(i<s.length()){
            if(j<p.length() &&(p.charAt(j)=='?'||p.charAt(j)==s.charAt(i))){
                i++;
                j++;
            } else if (j<p.length() && p.charAt(j)=='*') {
                startIndex=j;
                iIndex=i;
                j++;
            } else if (startIndex!=-1) {
                j=startIndex+1;
                i=iIndex+1;
                iIndex++;
            }
            else{
                return false;
            }
        }
        while(j<p.length() && p.charAt(j)=='*'){
            j++;
        }
        return j==p.length();
    }
    public static void main(String[] args) {
        String s="aab";
        String p="*ab";
        System.out.println(isMatch(s,p));
    }
}
