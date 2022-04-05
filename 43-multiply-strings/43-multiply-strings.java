class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int pos[]=new int[n+m];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int product=(num2.charAt(i)-'0')*(num1.charAt(j)-'0');
                int carry=i+j,rem=i+j+1;
                int sum=product+pos[rem];
                pos[carry]+=sum/10;
                pos[rem]=sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int p : pos)
			if(!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}